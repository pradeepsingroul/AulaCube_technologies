package com.aulacude.Exceptions;

import java.time.LocalDateTime;



public class MyErrorDetails {

	
	private String message;
	
	private LocalDateTime lct;
	
	private String desc;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getLct() {
		return lct;
	}

	public void setLct(LocalDateTime lct) {
		this.lct = lct;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public MyErrorDetails(String message, LocalDateTime lct, String desc) {
		super();
		this.message = message;
		this.lct = lct;
		this.desc = desc;
	}

	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
