package com.example.JPAImplementation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.JPAImplementation.response.JPAResponse;

@Entity
@Table(name="jpa_impl_table")
public class JPAEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String name;
	String username;
	String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
		return "JPAEntity [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + "]";
	}
	public JPAEntity(Long id, String name, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public JPAEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
