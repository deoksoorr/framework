package com.bit.action;

import com.bit.model.Emp02Dao;
import com.bit.model.entity.Emp02Vo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UpdateAction extends ActionSupport implements Preparable, ModelDriven<Emp02Vo>{

	Emp02Vo bean;

	public Emp02Vo getBean() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		if(hasFieldErrors()){
			return this.INPUT;
		}
		Emp02Dao dao=new Emp02Dao();
		dao.updateOne(bean);
		return this.SUCCESS;
	}
	
	@Override
	public void validate() {
		if(bean.getName().isEmpty()){
			addFieldError("bean.name", "이름을 확인하세요");
		}
	}
	
	@Override
	public void prepare() throws Exception {
		bean=new Emp02Vo();
	}
	
	@Override
	public Emp02Vo getModel() {
		return bean;
	}

}
