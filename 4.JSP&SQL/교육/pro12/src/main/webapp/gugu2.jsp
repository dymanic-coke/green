<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	int dan = Integer.parseInt(request.getParameter("dan"));
	int min = dan-3;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력창</title>
</head>
<body>
	<table border="1" width="800">
	<%
		for(int x= dan-2; x<=dan; x++){
		if(x > 1){
	%>
		<tr align="center" bgcolor="#ffff66">
			<td colspan="2"><%=x %>단 출력</td>
		</tr>
	<%
		for(int i=1;i<10;i++){
			if(i%2 == 1){
	%>
		<tr align="center" bgcolor="#ccff66">
	<%
			}else{
	%>
		<tr align="center" bgcolor="#ccccff">
	<% 
			}
	%>	
			<td width="400">
				<%=x %> * <%=i %>
			</td>
			<td width="400">
				<%=x*i %>
			</td>
		</tr>
	<%
		}			
		}else{
		}
		}
	%>
	</table>
</body>
</html>