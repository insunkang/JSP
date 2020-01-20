package fw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		//1.요청정보추출
		//2.비즈니스메소드 추출
		
		DeptDAOImpl dao = new DeptDAOImpl();
		ArrayList<DeptDTO> deptlist = dao.DeptList();
		
		
		pw.print("<h1>부서목록보기</h1>");
		pw.print("<hr/>");
		pw.print("<table border ='1', width ='500px'>");
		pw.print("<tr>");
		pw.print("<th>부서코드</th><th>부서명</th><th>위치</th>");
		pw.print("<th>전화번호</th><th>관리자</th><th>삭제</th>");
		pw.print("</tr>");
		
		int size = deptlist.size();
		for(int i = 0; i<size;i++){
			DeptDTO dept = deptlist.get(i);
			pw.print("<tr>");
			pw.print("<td>"+dept.getDeptNo()+"</td>");
			pw.print("<td>"+dept.getDeptName()+"</td>");
			pw.print("<td>"+dept.getLoc()+"</td>");
			pw.print("<td>"+dept.getTel()+"</td>");
			pw.print("<td>"+dept.getMgr()+"</td>");
			pw.print("<td><a href='/serverweb/dept/delete.do?deptno="+dept.getDeptNo()+"&info=test'>삭제</a></td>");
			pw.print("</tr>");
			
		}
		
	}

}
