package com.jsp.board.model;

import java.time.LocalDateTime;

public class BoardVOPractice {
	
	private String writer;
	private String title2;
	private String content2;
	private LocalDateTime regDate2;
	
	public BoardVOPractice() {}

	public BoardVOPractice(String writer, String title2, String content2, LocalDateTime regDate2) {
		super();
		this.writer = writer;
		this.title2 = title2;
		this.content2 = content2;
		this.regDate2 = regDate2;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public String getContent2() {
		return content2;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public LocalDateTime getRegDate2() {
		return regDate2;
	}

	public void setRegDate2(LocalDateTime regDate2) {
		this.regDate2 = regDate2;
	}

	@Override
	public String toString() {
		return "BoardVOPractice [writer=" + writer + ", title2=" + title2 + ", content2=" + content2 + ", regDate2="
				+ regDate2 + "]";
	}

		
}
