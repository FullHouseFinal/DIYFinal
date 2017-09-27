<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>connectedUser</title>
	</head>
	<body>
		<c:if test="${sessionScope.id != null and sessionScope.id != 'admin'}"> 
	 		${sessionScope.id}님이 로그인 중 ......<br>
			<h2><a href="/admin/board/gallery">갤러리</a></h2><br>
			<h2><a href="/admin/user/userPage">마이 페이지</a></h2><br>
			<h2><a href="/admin/user/logout">로그아웃</a></h2><br>
		</c:if>
		<c:if test="${sessionScope.id != null and sessionScope.id == 'admin'}">
			${sessionScope.id}님이 로그인 중 ......<br>
			<h2><a href="/admin/user/userList">일반 회원 목록</a></h2><br>
			<h2><a href="/admin/user/companyList">기업 회원 목록</a></h2><br>
			<h2><a href="/admin/user/logout">로그아웃</a></h2><br>
		</c:if>
	</body>
</html>