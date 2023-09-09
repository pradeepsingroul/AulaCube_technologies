package com.aulacude.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;

@Entity
public class User {
	
	
	@Id
	private Integer id;
	
	private String userName;
	
	@Email(message = "email should be in proper format")
	private String email;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	
	private String address;

//	@OneToMany
//	private List<Task> tasks;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public User(Integer id, String userName, @Email(message = "email should be in proper format") String email,
			String password, String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
