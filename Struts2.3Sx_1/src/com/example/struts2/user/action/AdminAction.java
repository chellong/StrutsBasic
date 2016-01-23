package com.example.struts2.user.action;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 174113537701177211L;

	@Override
	public String execute() throws Exception {
		return "mainpage";
	}

}
