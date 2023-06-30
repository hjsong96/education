<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main입니다.</title>
<style type="text/css">
/* 스타일 영역입니다. */
table {
	width : 100%;
	height : 500px;
	background-color : white;
	boder-collapse : collapse;
}
td {
	border-bottom : 1px red dotted;
	text-align : center;
}
/* id="title" --> #title */
#title {
text-align : left;
}
/* 호버 */
tr:hover {
	background-color: gold;
	color: red;
}




</style>
</head>
<body>
	<a href="./index.jsp">index로 가기</a>
	<table style="width: 100%; height: 500px; background-color: white;">
	<tr>
		<td style="width: 10%">번호</td>
		<td style="width: 30%">제목</td>
		<td style="width: 10%">글쓴이</td>
		<td style="width: 10%">조회수</td>
		<td style="width: 20%">쓴날짜</td>
	</tr>
	<tr><!--for문 돌리기-->
	<% 
	for(int i = 1; i <= 10; i++){
	%>
		<td><%=i %></td>
		<td id="title" title="마우스 올리면 나올 글">열번째 글</td>
		<td>홍길동</td>
		<td>5</td>
		<td>2023-06-26</td>
	</tr>

	<% } %> <!--닫기-->
	
	</table>
</body>
</html>