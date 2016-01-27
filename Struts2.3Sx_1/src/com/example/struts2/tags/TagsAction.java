package com.example.struts2.tags;

import com.opensymphony.xwork2.ActionSupport;

public class TagsAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5426065546106297643L;

	private String username;

	private String password;

	public TagsAction() {
	}

	public String execute() {
		System.out.println("TagsAction");
		this.addFieldError("fielderror.test", "wrong!");
		return SUCCESS;
	}
	
	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
}