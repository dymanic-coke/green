<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>안녕하세요. 쇼핑몰 중심 JSP 시작입니다.!!!</h1>
	<br>
	<jsp:include page="image.jsp" flush="true">
		<jsp:param value="꽃" name="name"/>
		<jsp:param value="flowers.png" name="imgName"/>
	</jsp:include>
	<br>
	<h1>안녕하세요. 쇼핑몰 중심 JSP 끝 부분입니다.!!!</h1>
</body>
</html>