<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, sec01.ex01.*" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
	List memberList = new ArrayList();
	MemberBean m1 = new MemberBean("son", "1234", "손흥민", "son@test.com");
	MemberBean m2 = new MemberBean("ki", "5678", "기성룡", "ki@test.com");
	MemberBean m3 = new MemberBean("park", "1357", "박지성", "park@test.com");
	
	memberList.add(m1);
	memberList.add(m2);
	memberList.add(m3);
%>
	<c:set var = "memberList" value="<%=memberList %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
	<c:forEach var="i" begin="0" end="10" step="1">
		<c:if test="${memberList[i] != null}">
		<tr align="center">
			<td>${memberList[i].id}</td>
			<td>${memberList[i].pw}</td>
			<td>${memberList[i].name }</td>
			<td>${memberList[i].email }</td>
		</tr>
		</c:if>		
	</c:forEach>
	</table>
</body>
</html>