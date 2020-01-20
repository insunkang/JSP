<%@page import="member.Member2DAOImpl"%>
<%@page import="member.Member2DTO"%>
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
		%>
</body>
</html>