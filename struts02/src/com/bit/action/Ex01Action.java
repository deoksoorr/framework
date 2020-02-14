package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action{

	@Override
	public String execute() throws Exception {
//		return "success"; result 문구 속성은 success, none, error, input, login만 존재한다.
//		return "error";
		return this.SUCCESS;
	}
	
}
