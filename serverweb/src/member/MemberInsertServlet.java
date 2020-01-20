package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "meminsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String deptno = request.getParameter("deptno");
		String grade = request.getParameter("grade");	
		String point1 = request.getParameter("point");	
		int point = Integer.parseInt(point1);
		Member2DTO member = new Member2DTO(id,pass,name,addr,deptno,grade,point);
		
		Member2DAOImpl a= new Member2DAOImpl();
		int result = a.insert(member);
		
		//3.응답화면으로 요청재지정
		response.sendRedirect("/serverweb/member/insertResult.html");
		
	}

}
