<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%
	request.setCharacterEncoding("utf-8");
	session.setAttribute("address", "수원시 팔당구");
	String id = (String)request.getAttribute("id");
	String pw = (String)request.getAttribute("pw");
	String name = (String)session.getAttribute("name");
	String email = (String)application.getAttribute("email");
	String address = (String)request.getAttribute("address");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr align="center" bgcolor="skyblue">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
			<td width="7%"><b>주소</b></td>
		</tr>
		<tr align="center">
			<td>${id}</td>
			<td>${pw}</td>
			<td>${name}</td>
			<td>${email}</td>
			<td>${address}</td>
		</tr>
	</table>
</body>
</html>