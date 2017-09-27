<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="/admin/resources/js/jquery-3.2.1.js"></script>
		<title>connectedCompany</title>
	</head>
	<body>
		<script>
			function block(){
				if(${coAuth == '0'}){
					alert("접근 권한이 없습니다!");
					return false;
				}
			}
		</script>
		<c:if test="${sessionScope.CoId != null and sessionScope.CoId != 'admin'}">
	 		${sessionScope.CoId}님이 로그인 중 ......<br>
			<h2 onclick="block()"><a href="/admin/user/companyPage">마이 페이지</a></h2><br>
			<h2><a href="/admin/user/logout">로그아웃</a></h2><br>
		</c:if>
	</body>
</html>