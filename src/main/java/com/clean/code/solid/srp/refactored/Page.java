package com.clean.code.solid.srp.refactored;

public class Page {
	private Integer number;
	private String content;
	
	public Page(Integer number, String content) {
		super();
		this.number = number;
		this.content = content;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
