<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--커스텀 태그 중 core 작성시 필수로 넣을것 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String age = request.getParameter("age");
	String height = request.getParameter("height");
%> --%>
<c:set var="id" value="kim" scope="page" />
<c:set var="pw" value="1234" scope="page" />
<c:set var="name" value="김희재" scope="page" />
<c:set var="age" value="35" scope="page" />
<c:set var="height" value="${173}" scope="page" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<table align="center" border=1>
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>나이</b></td>
			<td width="7%"><b>키</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
		<tr align="center">
			<td>${id}</td>
			<td>${pw}</td>
			<td>${name}</td>
			<td>${age}</td>
			<td>${height}</td>
			<td>${email}</td>
		</tr>
<%-- <c:set var="id" value="<%=id %>" scope="page" />
<c:set var="pw" value="<%=pw %>" scope="page" />
<c:set var="name" value="<%=name %>" scope="page" />
<c:set var="age" value="<%=age %>" scope="page" />
<c:set var="height" value="<%=height %>" scope="page" />
<c:set var="email" value="<%=email %>" scope="page" />	 --%>			
		<tr align="center">
			<td>${param.id}</td>
			<td>${param.pw}</td>
			<td>${param.name}</td>
			<td>${param.age}</td>
			<td>${param.height}</td>
			<td>${param.email}</td>
		</tr>		
	</table>
</body>
</html>