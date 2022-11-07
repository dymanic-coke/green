<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, sec01.ex01.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
	<jsp:useBean id="membersList" class="java.util.ArrayList" />
	<jsp:useBean id="membersMap" class="java.util.HashMap" />
<%
	membersMap.put("id", "park2");
	membersMap.put("pw", "1234");
	membersMap.put("name", "박지성");
	membersMap.put("email", "park2@test.com");
	MemberBean m1 = new MemberBean("son", "3456", "손흥민", "son@test.com");
	MemberBean m2 = new MemberBean("ki", "7890", "기성룡", "ki@test.com");
	membersList.add(m1);
	membersList.add(m2);
	membersMap.put("membersList", membersList);
%>
	<c:set var="membersList" value="${membersMap.membersList}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1 align="center">
		<tr align="center" bgcolor="skyblue">
			<th width="150">아이디</th>
			<th width="150">비밀번호</th>
			<th width="150">이름</th>
			<th width="150">이메일</th>
		</tr>
		<tr align="center">
			<td>${membersMap.id}</td>
			<td>${membersMap.pw}</td>
			<td>${membersMap.name}</td>
			<td>${membersMap.email}</td>
		</tr>
		<tr align="center">
			<td>${membersList[0].id}</td>
			<td>${membersList[0].pw}</td>
			<td>${membersList[0].name}</td>
			<td>${membersList[0].email}</td>
		</tr>
		<tr align="center">
			<td>${membersList[1].id}</td>
			<td>${membersList[1].pw}</td>
			<td>${membersList[1].name}</td>
			<td>${membersList[1].email}</td>
		</tr>
	</table>
</body>
</html>