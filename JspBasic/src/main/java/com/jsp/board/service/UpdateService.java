package com.jsp.board.service;

import java.time.LocalDateTime;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class UpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 새롭게 수정한 입력갑 끄러오고 vo생성 수정을 원한는 글번호 객체를 새글 겍체로 바꿔라 사용자는 수정 완료된 글의 상세보기 화면이 응답읻 되어야 함ㄴ다.
		
//		String writer = request.getParameter("writter");
//		String content = request.getParameter("content");
//		String title = request.getParameter("title");
//		LocalDateTime updateTime = LocalDateTime.now();
//		
//		BoardVO vo = new BoardVO(writer, title, content, updateTime);
		
		BoardVO vo = new BoardVO(
					request.getParameter("writter"),
					request.getParameter("title"),
					request.getParameter("content"),
					LocalDateTime.now()								
				);
		
		BoardRepository
			.getInstance()
			.update(vo, Integer.parseInt(request.getParameter("boardNo")));

	}

}
