package com.example.struts2.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction5 extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int type;
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String execute() throws Exception {
		return "success";
	}

}
