package com.bit.controller;

import javax.servlet.http.HttpServletRequest;

import com.bit.core.BitController;

public class introController implements BitController {
	
	public String execute(HttpServletRequest req) {
		return "intro";
	}
}
