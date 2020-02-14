package com.bit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Emp02Dao;
import com.bit.model.Emp02Dao2;
import com.bit.model.entity.Emp02Vo;

public class EditController implements Controller{

	Emp02Dao2 dao;
	
	public void setDao(Emp02Dao2 dao) {
		this.dao = dao;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		int sabun=Integer.parseInt(request.getParameter("sabun"));
		Emp02Vo bean=dao.selectOne(sabun);
		mav.addObject("bean", bean);
		mav.setViewName("edit");
		return mav;
	}

}
