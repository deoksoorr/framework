<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>

<!-- Latest compiled and minified JavaScript -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="btn-group btn-group-justified" role="group" aria-label="...">
	<a href="./index.action" class="btn btn-default btn-block" role="button">HOME</a>
	<a href="./intro.action" class="btn btn-default btn-block" role="button">INTRO</a>
	<a href="./list.action" class="btn btn-primary btn-block" role="button">BBS</a>
	<a href="./login.action" class="btn btn-default btn-block" role="button">LOGIN</a>
</div>
<div class="container">
	<div class="row">
		<div class="col-sm-12">
			<div class="jumbotron">
				<h1>List page</h1>
				<p>...</p>
				<p><a class="btn btn-primary btn-lg" href="./add.action" role="button">Add</a></p>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-12">
			<table class="table">
				<tr>
					<th>사번</th>
					<th>이름</th>
					<th>날짜</th>
					<th>금액</th>
				</tr>
				<c:forEach items="${list }" var="bean">
				<tr>
					<td>${bean.sabun}</td>
					<td>${bean.name}</td>
					<td>${bean.nalja}</td>
					<td>${bean.pay}</td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>
</body>
</html>