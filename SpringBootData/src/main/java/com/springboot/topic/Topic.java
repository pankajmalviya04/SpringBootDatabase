package com.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String details;
	
	
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
	public String getDetails() {
		return details;
	}
	public void setDetails(String desc) {
		this.details = desc;
	}
	public Topic(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.details = desc;
	}
	public Topic() {
		
	}
}
