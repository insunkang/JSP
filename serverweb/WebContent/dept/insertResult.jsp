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
<%
		//서블릿이 공유한 데이터 꺼내오기
		int dept = (int)request.getAttribute("mydata");
	%>
	<h1>응답화면분리</h1>
	<hr/>
	<h2><%=dept %>삽입성공!!</h2>
	
</body>
</html>