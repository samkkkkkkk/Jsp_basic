package com.jsp.board.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardRepositoryParctice;
import com.jsp.board.model.BoardVOPractice;


@WebServlet("*.board2")
public class BoardControllerPractice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BoardControllerPractice() {
        super();
        
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getMethod().equals("POST")) {
			request.setCharacterEncoding("UTF-8");
		}
		
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length() + 1, uri.lastIndexOf("."));
		
		System.out.println("정제된 uri " + uri);
		
		switch(uri) {
		case "write":
			System.out.println("글쓰기 페이지로 이동 요청!");
			response.sendRedirect("board/board_write_practice.jsp");
			break;
		case "regist":
			System.out.println("글 등록 요청이 들어옴!");
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			BoardVOPractice vo = new BoardVOPractice();
			vo.setWriter(writer);
			vo.setWriter(title);
			vo.setContent2(content);
			vo.setRegDate2(LocalDateTime.now());
			
			BoardRepositoryParctice.getInstance().regist(vo);
			
			response.sendRedirect("/JspBasic/list.board2");
			
			break;
			
		case "list":
			System.out.println("글 목록 요청이 들어옴!");
			List<BoardVOPractice> list = BoardRepositoryParctice.getInstance().getList();
			
			request.setAttribute("boardList", list);
			
			RequestDispatcher dp
					= request.getRequestDispatcher("board/board_list_practice.jsp");
			dp.forward(request, response);
			
			break;
			
		}
	}

}
