<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberBean"  %>
    <%@ page import="member.MemberDao" %>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<% 
MemberBean mb= (MemberBean)request.getAttribute("detail");
String user_id = (String)session.getAttribute("id");
String user_name = (String)session.getAttribute("name");
String user_phone = (String)session.getAttribute("phone");
String user_birth = (String)session.getAttribute("birth");

%>
</head>
<body>
<form action="MemberMAction.me" method="post">
<table border="1" style="border-collapse: collapse;">
			<tr>
				<td colspan="2">회원정보 수정</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" value="<%= user_id %>" readonly></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
		
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="<%= user_name %>" readonly></td>
			</tr>
			
			
			<tr>
				<td>생년월일</td>
				<td><input type="text" name="birth" value="<%= user_birth %>"></td>
			</tr>
			<tr>
				<td>이메일주소</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>휴대폰 번호</td>
				<td><input type="text" name="phone" value="<%= user_phone %>" readonly></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정하기"> <input type="reset" value="다시작성하기"></td>
			</tr>
		</table>
</form>
</body>
</html>