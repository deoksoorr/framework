<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Dept list page...</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>부서명</th>
			<th>지역</th>
		</tr>
		<c:forEach items="${list }" var="bean" >
			<tr>
				<td>${bean.deptno }</td>
				<td>${bean.dname }</td>
				<td>${bean.loc }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>