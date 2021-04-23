<%@page import="member.SessionData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String id= request.getParameter("id"); 
	String name= request.getParameter("name");
	String phone= request.getParameter("phone");
	String birth= request.getParameter("birth");
	
	session.setAttribute("id",id);
	session.setAttribute("name",name);
	session.setAttribute("phone",phone);
	session.setAttribute("birth",birth);
	
	
	
	
%>
<script type="text/javascript" src="JS/jquery-3.5.1.js"></script>
<script type="text/javascript" src="JS/modify.js"></script>	
</head>
<body>
<h1>환영합니다</h1><br> 
<h2>${ id }님</h2>
<form action="BoardRemove.me" method="post"><input type="submit" value="회원탈퇴"></form>
<form action="BoardModify.me" method="post"><input type="submit" value="회원 정보 수정"></form>
<form action="BoardList.me" method="post"><input type="submit" value="목록보기"></form>
<form>
<h2>제이쿼리를 활용하여 버튼 분기 </h2>
<input type="submit" value="수정" id="update">
<input type="submit" value="삭제" id="delete">
</form>
</body>
</html>