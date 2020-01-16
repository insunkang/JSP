package fw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		
		String deno = request.getParameter("deptno");
		
		
		
		DeptDAOImpl a = new DeptDAOImpl();
		int result = a.delete(deno);
		
//		if(result==1) {
//			pw.print("<h1>삭제성공</h1>");
//		}else {
//			pw.print("<h1>삭제실패</h1>");
//		}
		response.sendRedirect("/serverweb/dept/list.do");
		 
		
		
		
		
	}


}
