package com.businessoffice.model;

public class User {
	private String id;
	private String name;
	private String login;
	private String password;
	private String usable;
	private String mobile;
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsable() {
		return usable;
	}
	public void setUsable(String usable) {
		this.usable = usable;
	}
}
