package com.example.struts2.user.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("all")
public class LoginAction1 extends ActionSupport {
	
	private static final long serialVersionUID = -5331147273908900345L;

	private Map request;
	private Map session;
	private Map application;
	
	public LoginAction1() {
	
		request = (Map)ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
	
	public String execute() {
		request.put("r1", "r1");
		session.put("s1", "s1");
		application.put("a1", "a1");
		return SUCCESS; 
	}
	
	
}
