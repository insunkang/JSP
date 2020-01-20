<%@page import="fw.DeptDAOImpl"%>
<%@page import="fw.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<% request.setCharacterEncoding("euc-kr");		
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");	
		DeptDTO member = new DeptDTO(deptNo,deptName,loc,tel,mgr);
		
		DeptDAOImpl a= new DeptDAOImpl();
		int result = a.insert(member);
		%>
		<h1><%=result %>개의 행 삽입 성공</h1>
		
</body>
</html>