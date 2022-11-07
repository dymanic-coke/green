<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	li{
		list-style-type: none;
	}
</style>
</head>
<body>
	<ul class="list_type">
		<li>
			<span style="margin-left:50px">이미지</span>
			<span>이미지 이름</span>
			<span>선택하기</span>
		</li>
<%
	for(int i=0; i<10; i++){
%>
		<li>
			<a href='#' style='margin-left:50px' >
				<img src='image/flowers.png' width='90' height='90' /></a>
			<a href='#'><strong>이미지 이름 : 꽃<%=i %></strong></a>
			<a href='#'><input type="checkbox" name='chk<%=i %>' /></a>
		</li>
	</ul>
<%
	}
%>
</body>
</html>