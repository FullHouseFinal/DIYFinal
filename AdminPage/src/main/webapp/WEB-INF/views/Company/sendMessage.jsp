<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>sendMessage</title>
	</head>
	<body>
		<h3>Message</h3>
		<form action="/admin/file/send" method="post">
			<p>
				담당자 이메일: <input type="text" id="coManagerEmail" name="coManagerEmail"><br>
				제목: <input type="text" id="title" name="title" required="required"><br>
				내용: <textarea name="content" required="required"></textarea>
			</p>
			<input type="submit" value="전송">
		</form>
	</body>
</html>