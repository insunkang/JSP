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
<h1>부서목록보기</h1>
		<hr/>
		<table border ='1', width ='500px'>
		<tr>
		<th>사번</th><th>패스워드</th><th>이름</th>
		<th>주소</th><th>부서코드</th><th>등급</th>
		<th>포인트</th><th>삭제</th>
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
		<td><a href='/serverweb/member/delete.do?id=<%=member.getId()%>'>삭제</a></td>
		</tr><%	
	}
	%>
	</table>
	
</body>
</html>