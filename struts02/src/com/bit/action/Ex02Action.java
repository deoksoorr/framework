package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action{

	String id;
	String pw;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println(id);
		System.out.println(pw);
		return this.SUCCESS;
	}
	
}
