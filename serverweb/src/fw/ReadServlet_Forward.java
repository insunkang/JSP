package fw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Read", urlPatterns = { "/dept/Read.do" })
public class ReadServlet_Forward extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		DeptDAOImpl dao = new DeptDAOImpl();
		DeptDTO dto = new DeptDTO();				
		String read = request.getParameter("deptno");
		String info  =  request.getParameter("info");
		dto = dao.read(read);
		System.out.println("한글정보 추출"+info);
		
		request.setAttribute("info", info);
		request.setAttribute("dept", dto);		
		RequestDispatcher rd = request.getRequestDispatcher("/dept/dept_read.jsp");
		rd.forward(request, response);
		
		
		
	}

}
