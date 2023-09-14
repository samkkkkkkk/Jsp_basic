<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>${boardNo}번 게시물</h2>
	
	<p>
		# 작성자: ${modify.writter}<br>
		# 제목 : ${modify.title} <br>
		# 내용 : <textarea rows="5" readonly>${modify.content}</textarea>		
	</p>
		
	<a href="/JspBasic/list.board">글 목록 보기</a>
	<a href="/JspBasic/update.board?bId=${boardNo}">글 수정완료</a>
	
</body>
</html>