<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
	<c:set var="id" value="kim" scope="page" />
	<c:set var="pw" value="1234" scope="page" />
	<c:set var="name" value="김희재" scope="page" />
	<c:set var="age" value="35" scope="page" />
	<%-- <c:set var="height" value="173" scope="page" /> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr align="center" bgcolor="lightgreen">
			<th width="150">아이디</th>
			<th width="150">비밀번호</th>
			<th width="150">이름</th>
			<th width="150">나이</th>
			<th width="150">키</th>
		</tr>	
	<c:choose>
		<c:when test="${empty id }">
			<tr align="center">
				<td colspan=5>아이디를 입력하세요</td>
			</tr>
		</c:when>
		<c:when test="${empty pw }">
			<tr align="center">
				<td colspan=5>비밀번호를 입력하세요</td>
			</tr>
		</c:when>
		<c:when test="${empty name }">
			<tr align="center">
				<td colspan=5>이름을 입력하세요</td>
			</tr>
		</c:when>
		<c:when test="${empty age }">
			<tr align="center">
				<td colspan=5>나이를 입력하세요</td>
			</tr>
		</c:when>
		<c:when test="${empty height }">
			<tr align="center">
				<td colspan=5>키를 입력하세요</td>
			</tr>
		</c:when>
		<c:otherwise>
			<tr align="center">
				<td>${id }</td>
				<td>${pw }</td>
				<td>${name }</td>
				<td>${age }</td>
				<td>${height }</td>
			</tr>	
		</c:otherwise>
	</c:choose>
	</table>
</body>
</html>