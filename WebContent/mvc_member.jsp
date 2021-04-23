<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 창</title>

</head>
<body>
<form action="MemberAddAction.me" method="post">
<table border="1" style="border-collapse: collapse;">
			<tr>
				<td colspan="2">회원가입</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password" name="password2"></td>
			</tr>
		
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			
			
			<tr>
				<td>생년월일</td>
				<td><input type="text" name="birth"></td>
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
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="가입하기"> <input type="reset" value="다시작성하기"></td>
			</tr>
		</table>
</form>

</body>
</html>