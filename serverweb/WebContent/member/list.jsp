<%@page import="member.Member2DTO"%>
<%@page import="java.util.ArrayList"%>
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
<h1>�μ���Ϻ���</h1>
		<hr/>
		<table border ='1', width ='500px'>
		<tr>
		<th>���</th><th>�н�����</th><th>�̸�</th>
		<th>�ּ�</th><th>�μ��ڵ�</th><th>���</th>
		<th>����Ʈ</th><th>����</th>
		</tr>
		<% 
		ArrayList<Member2DTO> a = (ArrayList<Member2DTO>)request.getAttribute("mydata");
		int size = a.size();
		%>
		
	<%
	for(int i = 0; i<size;i++){
		Member2DTO member = a.get(i);
		%><tr>
		<td><a href="/serverweb/member/read.do?id=<%=member.getId()%>"><%= member.getId()%></a></td>
		<td><%= member.getPass()%></td>
		<td><%=member.getName()%></td>
		<td><%=member.getAddr()%></td>
		<td><%=member.getDeptno()%></td>
		<td><%=member.getGrade()%></td>
		<td><%=member.getPoint()%></td>
		<td><a href='/serverweb/member/delete.do?id=<%=member.getId()%>'>����</a></td>
		</tr><%	
	}
	%>
	</table>
	
</body>
</html>