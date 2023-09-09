package com.aulacude.Entities;

import com.aulacude.Enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

	
	@Id
	private Integer id;
	
	private String title;
	
	private String description;
	
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Task(Integer id, String title, String description, String status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
