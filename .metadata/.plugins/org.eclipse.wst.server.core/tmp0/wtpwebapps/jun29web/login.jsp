<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인</title>
<style type="text/css">

#loginBox{
	/* id = #, class= . */
	background-color: #c1c1c1;
	width: 300px;
	height: 300px;
	padding: 50px 10px;
}
input{
	padding:0;
	margin:0;
	border:0;
	width:100%;
	height:30px;
	text-align:center;
	height:30px;
	margin-bottom: 10px;
}

input[type=text] {
	background-color: yellow;
	color: black;
}

input[type=password] {
	background-color: black;
	color: white;

}


</style>
</head>
<body>
	<div id="loginBox">
		<form action="./loginAction.jsp">
		<input type="text" name="id">
		<input type="password" name="pw">
		<button>로그인</button>
		</form>
	</div>
</body>
</html>