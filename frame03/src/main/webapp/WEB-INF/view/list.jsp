<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type = "text/css" href="css/bootstrap.css"/>
<style type="text/css">
	div{
		padding-left: 50px;
	}
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
   <div class="jumbotron">
      <h1>LIST PAGE</h1>
      <p><a class="btn btn-primary btn-lg" style="margin-right: 30px;"href="add.bit" role="button">ADD</a><a class="btn btn-primary btn-lg" href="index.bit" role="button">HOME</a></p>
   </div>
   <table class="table">
      <tr>
         <th>사번</th>
         <th>이름</th>
         <th>날짜</th>
         <th>금액</th>
      </tr>
      <c:forEach items="${list }" var ="bean">
      <tr>
         <td>${bean.sabun }</td>
         <td>${bean.name }</td>
         <td>${bean.nalja }</td>
         <td>${bean.pay }</td>
      </tr>
      </c:forEach>
   </table>
</body>
</html>