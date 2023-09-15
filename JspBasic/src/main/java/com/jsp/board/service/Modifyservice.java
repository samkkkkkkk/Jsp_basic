package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class Modifyservice implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		request.setAttribute("article", BoardRepository.getInstance().getContent(bId));
		BoardVO vo =  BoardRepository.getInstance().getContent(bId);
		request.setAttribute("article", vo);
		request.setAttribute("boardNo", bId);
		
	}

}
