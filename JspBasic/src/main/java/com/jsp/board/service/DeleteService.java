package com.jsp.board.service;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;


public class DeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		BoardRepository
		.getInstance()
		.delete(Integer.parseInt(request.getParameter("bId")));

	}

}
