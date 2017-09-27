<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="/admin/resources/js/jquery-3.2.1.js"></script>
		<title>userPageMenu</title>
	</head>
	<body>
		<h1>userPageMenu</h1>
		<h2><a href="/admin/user/userRead?id=${id}">나의 정보 보기/수정</a></h2>
		<h2><a href="/admin/user/userDelete?id=${id}">회원 탈퇴</a></h2> 
	</body>
</html>