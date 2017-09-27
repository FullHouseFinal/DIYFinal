<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Division</title>
	</head>
	<body>
	<script>
		function joinUserForm(){
			location.href="/admin/user/joinUserForm";
		}
		
		function joinCompanyForm(){
			location.href="/admin/user/joinCompanyForm";
		}
	</script>
		<h1>회원 가입</h1>
			<input type="button" value="일반" onclick="joinUserForm()">
			<input type="button" value="기업" onclick="joinCompanyForm()">
			<input type="button" value="취소" onclick="history.go(-1)">
	</body>
</html>