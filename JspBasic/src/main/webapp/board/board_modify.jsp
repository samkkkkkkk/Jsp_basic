<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>${boardNo}번 게시물 내용 수정</h2>
	<form action="/JspBasic/update.board" method="post"> <!-- post방식 전송은 url에 파라미터가 붙지 않음 -->
		<input type="hidden" name="boardNo" value="${boardNo}" readonly>
		<p>
			# 작성자: <input type="text" name="writter" value="${article.writter}"> <br>
			# 제목: <input type="text" name="title" value="${article.title}"> <br>
			# 내용: <textarea rows="3" name="content">${article.content}</textarea>
			<input type="submit" value="수정">	
		</p>
	</form>
	
</body>
</html>