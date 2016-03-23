<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
</head>
<body>
	<form method="post" action="/j_security_check">
		用户名：<input type="text" name="username"/> <br/>
		密码：<input type="text" name="password"/> <br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>