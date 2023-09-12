<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="/JspBasic/cookie/servletpractice" method="post">
		<input type="text" name="id" size="10" placeholder="ID">
		<input type="password" name="pw" size="10" placeholder="pw">
		<input type="submit" value="로그인">
	</form>	

</body>
</html>