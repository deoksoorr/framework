package com.bit.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatchServlet extends HttpServlet{
	
	Map<String, String> map=new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		map.put("/", "com.bit.controller.indexController");
		map.put("/intro", "com.bit.controller.introController");
		map.put("/bbs/list", "com.bit.controller.listController");
		map.put("/bbs/add", "com.bit.controller.addController");
		map.put("/bbs/insert", "com.bit.controller.insertController");
		map.put("/bbs/detail", "com.bit.controller.detailController");
		map.put("/bbs/update", "com.bit.controller.updateController");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doBit(req,resp);
	}
   
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   req.setCharacterEncoding("utf-8");
	   doBit(req,resp);
	}
   
	protected void doBit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		String url=req.getRequestURI(); 
		url=url.substring(req.getContextPath().length());
		BitController controller=null;
		
		String info=map.get(url);

		try {
	      	Class<?> clzz=Class.forName(info);
	      	controller=(BitController)clzz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
      
		String viewName=controller.execute(req);
      
		if(viewName.startsWith("redirect:")) {
			resp.sendRedirect(viewName.substring(9));
		}else {
			String prifix="/WEB-INF/view/";
			String suffix=".jsp";
			viewName=prifix+viewName+suffix;
			RequestDispatcher rd=req.getRequestDispatcher(viewName);
			rd.forward(req, resp);
		}
	}
}