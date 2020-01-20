package member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "read", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");//Post방식에서만 사용
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		Member2DAOImpl dao = new Member2DAOImpl();
		Member2DTO dto = new Member2DTO();				
		String read = request.getParameter("id");
		
		dto = dao.read(read);
		
		request.setAttribute("member", dto);		
		RequestDispatcher rd = request.getRequestDispatcher("/member/member_read.jsp");
		rd.forward(request, response);
		
		
		
	}

}
