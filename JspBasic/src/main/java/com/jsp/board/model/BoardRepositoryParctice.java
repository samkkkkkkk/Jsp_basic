package com.jsp.board.model;

import java.util.ArrayList;
import java.util.List;

public class BoardRepositoryParctice {
	
	private static final List<BoardVOPractice> boardLists = new ArrayList<>();
	
	public BoardRepositoryParctice() {}
	
	private static BoardRepositoryParctice repositories = new BoardRepositoryParctice();
	
	public static BoardRepositoryParctice getInstance() {
		return repositories;
	}
	
	public void regist(BoardVOPractice vo) {
		boardLists.add(vo);
	}
	
	public List<BoardVOPractice> getList(){
		return boardLists;
	}
	
	
}
