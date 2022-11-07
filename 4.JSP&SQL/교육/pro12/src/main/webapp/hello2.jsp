<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name = "이순신";
	public String getName(){
		return name;
	}
%>
<%
	String age = request.getParameter("age");
	String u_id = request.getParameter("u_id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿 연습</title>
</head>
<body>
	<form name="frmlogin" method="post" action="hello2.jsp">
		아이디:<input type="text" name="u_id">
		<input type="submit" value="ㅇㅇ">
	</form>
	<p>입력한 아이디 : <%= u_id %></p>
</body>
</html>