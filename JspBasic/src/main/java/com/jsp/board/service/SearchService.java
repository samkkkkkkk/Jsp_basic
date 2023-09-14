package com.jsp.board.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		/*
		List<BoardVO> searchList = new ArrayList<>();
		List<BoardVO> list = BoardRepository.getInstance().getList();
		
		for(BoardVO w : list) {
			
			if(w.getWritter().contains(request.getParameter("keyword"))) {
				searchList.add(w);
			}
		}
		
		request.setAttribute("boardList", searchList);
		*/
		String keyword = request.getParameter("keyword");
		List<BoardVO> list = BoardRepository.getInstance().search(keyword);
		
		request.setAttribute("boardList", list);
		

	}

}
