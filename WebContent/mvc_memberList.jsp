<%@page import="org.apache.tomcat.util.security.MD5Encoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberBean" %>
    <%@ page import="member.MemberCAction" %>
    <%@ page import="member.MemberDao" %>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
회원정보 목록 보기
<% 
ArrayList <MemberBean> mlist= (ArrayList)request.getAttribute("memberlist");
%>
<table border="1" style="border-collapse: collapse;">
			<tr>
				<td colspan="2">회원정보</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>이름</td>
			</tr>
			<!-- // 동적배열은 length 대신에 size를 써야한다!! 그리고 < -->
<% for(int i=0;i<mlist.size();i++){  
		MemberBean malist=(MemberBean)mlist.get(i);%>
	<tr>
	
	<td><%= malist.getId() %></td>
	<td><%= malist.getName() %></td>
											<!-- 띄워쓰기 조심!!!! -->
	</tr>
	<tr><td><%= (mlist.get(i).toString()).substring(10)%> </td>
		<td>상세정보</td>
	</tr>	

<%	}	
%>
		 
			
			
		</table>



</body>
</html>