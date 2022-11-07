<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" 
    import="java.util.*, sec01.ex02.*" %>
<%
	request.setCharacterEncoding("utf-8"); 
%>
<jsp:useBean id="m" class="sec01.ex02.MemberBean" />
<jsp:setProperty name="m" property="*" />
<jsp:useBean id="addr" class="sec01.ex02.Address" />
<jsp:setProperty name="addr" property="city" value="대전광역시" />
<jsp:setProperty name="addr" property="zipcode" value="30020" />
<%
	m.setAddr(addr);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
			<td width="7%"><b>도시</b></td>
			<td width="7%"><b>우편번호</b></td>
		</tr>
		<tr align="center">
			<td>${m.id}</td>
			<td>${m.pw}</td>
			<td>${m.name}</td>
			<td>${m.email}</td>
			<td><%=m.getAddr().getCity() %></td>
			<td><%=m.getAddr().getZipcode() %></td>
		</tr>
		<tr align="center">
			<td>${m.id}</td>
			<td>${m.pw}</td>
			<td>${m.name}</td>
			<td>${m.email}</td>
			<td>${m.addr.city}</td>
			<td>${m.addr.zipcode}</td>
		</tr>
	</table>
</body>
</html>