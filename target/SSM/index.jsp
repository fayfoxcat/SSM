<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="controller/queryStudentByNo" method="post">
		学号<input type="text" name="sno"/>
		<input type="submit" value="查询"/>
	</form><br/>
	
	<form action="controller/queryStudentById" method="post">
		学号<input type="text" name="sno"/>
		<input type="submit" value="查询"/>
	</form><br/>
	
	<a href="controller/test">测试</a>
	
</body>
</html>