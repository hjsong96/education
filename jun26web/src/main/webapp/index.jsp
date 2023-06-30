<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>네이버 : 당신의 검색</title>
</head>
<body>
	글을 씁니다.<br>
	<h1>가장 큰 글씨</h1>
	<a href="https://www.naver.com">네이버</a>
<%
//여기는 자바입니다.
int num = 10;
num += 1;
%>
<hr>
num : <%=num %>

<%
for(int i = 0; i < 10; i++){
%>	

	<%=i %> 반복됩니다. <br>

<% 
//for문 닫기
}		
%>

<%
for(int i = 1; i < 10; i++){
%>
	
	2 * <%=i %> = <%=2*i%> <br> 

<%
}
%>

<a href="./main.jsp">메인으로</a>




</body>
</html>