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
		//������ ������ ������ ��������
		int dept = (int)request.getAttribute("mydata");
	%>
	<h1>����ȭ��и�</h1>
	<hr/>
	<h2><%=dept %>���Լ���!!</h2>
	
</body>
</html>