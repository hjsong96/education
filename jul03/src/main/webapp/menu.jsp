<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
body {
	margin: 0;
	padding: 0;
}

nav {
	width: 100%;
	height: 50px;
	background-color: black;
	overflow: hidden;
}

ul, li {
	margin: 0;
	padding: 0;
}

li {
	float: left;
	min-width: 30px;
	height: 50px;
	list-style: none;
	line-height: 50px;
	background-color: black;
	color: white;
	margin: 0 30px;
	text-align: center;
}

li:hover {
	font-weight: bolder;
	cursor: pointer;
}

li img {
	vertical-align: middle;
}

#menu {
	margin: 0 auto;
	min-width: 600px;
	height: 100%;
}
li a{
	text-decoration: none;
	color : white;
}
</style>
	<nav>
		<div id="menu">
			<ul>
				<li onclick="location.href='./'"><img src="./apple.png" alt="HOME"></li>
				<li><a href="./main.jsp">Main</a></li>
				<li onclick="location.href='./semantic.jsp'">semantic</li>
				<li onclick="location.href='./board'">게시판</li>
				<li>Watch</li>
				<li>Vision</li>
			</ul>
		</div>
	</nav>