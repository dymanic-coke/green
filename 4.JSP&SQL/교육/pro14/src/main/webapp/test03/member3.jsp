<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var="id" value="hong" scope="page" />
<c:set var="pw" value="1234" scope="page" />
<c:set var="name" value="홍길동" scope="page" />
<c:set var="age" value="34" scope="page" />
<c:set var="height" value="173" scope="page" />
<c:remove var="age" />
<c:remove var="height" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1 align="center">
		<tr align="center" bgcolor="lightgreen">
			<th width="150">아이디</th>
			<th width="150">비밀번호</th>
			<th width="150">이름</th>
			<th width="150">나이</th>
			<th width="150">키</th>
		</tr>
		<tr align="center">
			<td>${id}</td>
			<td>${pw}</td>
			<td>${name}</td>
			<td>${age}</td>
			<td>${height}</td>
		</tr>
	</table>
</body>
</html>