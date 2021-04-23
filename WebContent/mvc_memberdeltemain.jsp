<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String id= request.getParameter("id"); %>
</head>
<body>
<h1>안녕히 가세요</h1><br> 
<h2>${id} 님</h2>
<form action="BoardWrite.me" method="post"><input type="submit" value="회원가입페이지"></form>

</body>
</html>