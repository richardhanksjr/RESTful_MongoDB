package com.example;

import org.springframework.data.annotation.Id;

public class Task {

	@Id private String id;
	
	private Boolean complete;
	private String task;
	public Boolean getComplete() {
		return complete;
	}
	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	

}
