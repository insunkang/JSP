package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "memDel", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		
		String memberid = request.getParameter("id");
		
		
		
		Member2DAOImpl a = new Member2DAOImpl();
		int result = a.delete(memberid);
		
//		if(result==1) {
//			pw.print("<h1>삭제성공</h1>");
//		}else {
//			pw.print("<h1>삭제실패</h1>");
//		}
		response.sendRedirect("/serverweb/member/list.do");
		 
		
		
		
		
	}


}
