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
	
	<c:if test="${user_id == null }">
		<script>
			alert('로그인 하지 않은 유저는 접근할 수 없습니다.')
			location.href='session_login.jsp';
		</script>
	</c:if>
	
	<h2>%{user_id}님 환영합니다!</h2>
	
	<a href="/JspBasic/session/login_prac">로그아웃하기</a>
	
	
</body>
</html>