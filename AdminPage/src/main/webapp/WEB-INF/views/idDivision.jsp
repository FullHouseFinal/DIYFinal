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
	function userIdSearch(){
		location.href="/admin/user/UserIdSearch";
	}
	
	function companyIdSearch(){
		location.href="/admin/user/CompanyIdSearch";
		
		
		
		
	}
	</script>
		<h1>회원 가입</h1>
			<input type="button" value="일반 회원 아이디 찾기" onclick="userIdSearch()">
			<input type="button" value="기업 회원 아이디 찾기" onclick="companyIdSearch()">
	</body>
</html>