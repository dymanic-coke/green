<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%
	request.setCharacterEncoding("utf-8");
	String link = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="result.jsp">
		아이디 : <input type="text" name="id">
		<br>
		비밀번호 : <input type="password" name="pw">
		<br>
		<input type="submit" value="로그인">
		<input type="reset" value="다시입력">
	</form>
	<br><br>
	<a href="<%=link%>/test01/memberForm.jsp">회원가입하기</a>
</body>
</html>