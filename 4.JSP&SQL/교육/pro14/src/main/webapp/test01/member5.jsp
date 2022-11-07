<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"
    import="java.util.*, sec01.ex01.*" %>
<%
	request.setCharacterEncoding("utf-8");
%>
	<jsp:useBean id="m1" class="sec01.ex01.MemberBean" />
	<jsp:setProperty property="*" name="m1" />
	<jsp:useBean id="membersList" class="java.util.ArrayList" />
	<jsp:useBean id="membersMap" class="java.util.HashMap" />
<%
	membersMap.put("id", "park2");
	membersMap.put("pw", "1234");
	membersMap.put("name", "박지성");
	membersMap.put("email", "park2@test.com");	
	MemberBean m2 = new MemberBean("son", "3456", "손흥민", "son@test.com");
	membersList.add(m1);
	membersList.add(m2);
	membersMap.put("membersList", membersList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
		<tr align="center">
			<td>${membersMap.id}</td>
			<td>${membersMap.pw}</td>
			<td>${membersMap.name}</td>
			<td>${membersMap.email}</td>
		</tr>
		<tr align="center">
			<td>${membersMap.membersList[0].id}</td>
			<td>${membersMap.membersList[0].pw}</td>
			<td>${membersMap.membersList[0].name}</td>
			<td>${membersMap.membersList[0].email}</td>
		</tr>
		<tr align="center">
			<td>${membersMap.membersList[1].id}</td>
			<td>${membersMap.membersList[1].pw}</td>
			<td>${membersMap.membersList[1].name}</td>
			<td>${membersMap.membersList[1].email}</td>
		</tr>
	</table>
</body>
</html>