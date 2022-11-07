<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("user_id");
	String pw = request.getParameter("user_pw");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과창</title>
</head>
<body>
	<%
		if((id == null || id.length() == 0) || (pw == null || pw.length() == 0)){
	%>
	아이디 or 비밀번호가 입력되지 않았습니다.<br>
	<a href="login.html">로그인 창으로 이동</a>
	<%
		} else{
			if(id.equals("admin")){			
	%>
	<h1>환영합니다. 관리자님</h1>
	<form>
	<input type="button" value="회원정보 삭제하기">
	<input type="button" value="회원정보 수정하기">
	</form>
	<%
			} else{
	%>
	<h1>환영합니다. <%=id %>님!!</h1>
	<%
			}
		}
	%>	
</body>
</html>