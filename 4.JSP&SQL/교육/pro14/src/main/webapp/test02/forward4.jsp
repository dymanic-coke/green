<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%
	request.setCharacterEncoding("utf-8");
	request.setAttribute("id", "hong");
	request.setAttribute("pw", "1234");
	session.setAttribute("name", "홍길동");
	application.setAttribute("email", "hong@test.com");
	request.setAttribute("address", "대전광역시 동구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="member4.jsp" />
</body>
</html>