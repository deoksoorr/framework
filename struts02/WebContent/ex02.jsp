<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>RESULT PARAMS</h1>
	<p>id:<%=request.getAttribute("id") %></p>
	<p>pw:<%=request.getAttribute("pw") %></p>
	<button onclick="window.history.back()">뒤로</button>
</body>
</html>