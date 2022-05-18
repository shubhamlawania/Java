package com.example.JPAImplementation.request;

public class JPARequest 
{
	String name;
	String username;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "JPARequest [name=" + name + ", username=" + username + ", password=" + password + ", getName()="
				+ getName() + ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + "]";
	}
	public JPARequest(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public JPARequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
