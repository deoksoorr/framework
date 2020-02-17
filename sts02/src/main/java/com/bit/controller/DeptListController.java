package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Dept01Dao;

public class DeptListController implements Controller{
	
	Dept01Dao dao;
	
	public void setDao(Dept01Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", dao.selectAll());
		mav.setViewName("dept/list");
		return mav;
	}

}
