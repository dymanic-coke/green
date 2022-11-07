<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List dataList = new ArrayList();
	dataList.add("hello");
	dataList.add("world");
	dataList.add("안녕하세요");
%>
	<c:set var="list" value="<%=dataList %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- items로 활용시 정확지 ${}로 지정할것 ""만 쓰면 그냥 변수 삽입 --%>
	<c:forEach var="i" begin="0" end="10" step="1" varStatus="loop">
	i = ${i} &nbsp;&nbsp;&nbsp; 반복횟수 = ${loop.count}
	<br>
	</c:forEach>
	<br>
	<c:forEach var="i" begin="1" end="10" step="2">
	5 * ${i} = ${5*i}
	<br>
	</c:forEach>
	<br>
	<c:forEach var="data" items="${list}">
	${data}
	<br>
	</c:forEach>
	<br>
	<c:set var="fruits" value="사과와배와바나나와키위와참외와수박" />
	<%-- delims로 나눌경우 각종 방식을 활욜힐수 있음 --%>
	<c:forTokens var="token" items="${fruits}" delims= "와">
	${token}
	<br>
	</c:forTokens>
</body>
</html>