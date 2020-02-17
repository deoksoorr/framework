package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.Dept01Dao;
import com.bit.model.entity.Dept01Vo;

public class DeptAddController extends AbstractCommandController{

	Dept01Dao dao;
	
	public void setDao(Dept01Dao dao) {
		this.dao = dao;
	}
	
	@Override
	protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors)
			throws Exception {
		System.out.println("1:");
		System.out.println(command);
		System.out.println(errors);
		Dept01Vo bean=(Dept01Vo) command;
		if(bean.getDname().isEmpty()) {
			ObjectError error=new ObjectError("dname", "값이 비었습니다.");
			errors.addError(error);
		}
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		request.setCharacterEncoding("utf-8");
		String path="redirect:list.bit";
		System.out.println("2:");
		System.out.println(command);
		System.out.println(errors);
		if(errors.hasErrors()) {
			List<ObjectError> list=errors.getAllErrors();
			ObjectError err=list.get(0);
			path+="?err="+err.getDefaultMessage();
		}else {
			Dept01Vo bean=(Dept01Vo)command;
			dao.insertOne(bean);
		}
		ModelAndView mav=new ModelAndView();
		mav.setViewName(path);
		return mav;
	}
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		//mysql시 url 뒤에 다음 추가
//		//?useUnicode=true&amp;characterEncoding=UTF-8
//		//post 한글처리
//		request.setCharacterEncoding("utf-8");
//		Dept01Vo bean=new Dept01Vo();
//		bean.setDname(request.getParameter("dname"));
//		bean.setLoc(request.getParameter("loc"));
//		dao.insertOne(bean);
//
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("redirect:list.bit");
//		return mav;
//	}

}
