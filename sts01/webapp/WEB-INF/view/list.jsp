<%@page import="java.util.List"%>
<%@page import="com.bit.model.entity.Emp02Vo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<a href="index.bit">HOME</a>
		<a href="list.bit">BBS</a>
		<a href="login.bit">LOGIN</a>
	</nav>
	<h1>List page...</h1>
	<a href="add.bit">입력</a>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>입사일</th>
			<th>페이</th>
		</tr>
		<%
			java.util.List<Emp02Vo> list=(java.util.List<Emp02Vo>)request.getAttribute("alist");
			for(Emp02Vo bean:list){
		%>
		<tr>
			<td><%=bean.getSabun() %></td>
			<td><a href="detail.bit?sabun=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
			<td><%=bean.getNalja() %></td>
			<td><%=bean.getPay() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>