package com.tarikul.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Task {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	private String date;
	@NotEmpty
	private String stratTime;
	@NotEmpty
	private String stopTime;
	@NotEmpty
	private String description;
	@ManyToOne
	@JoinColumn(name="USER_EMAIL")
	private User user;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String date, String stratTime, String stopTime, String description) {
		this.date = date;
		this.stratTime = stratTime;
		this.stopTime = stopTime;
		this.description = description;
	}
	public Task(Long id, String date, String stratTime, String stopTime, String description, User user) {
		this.id = id;
		this.date = date;
		this.stratTime = stratTime;
		this.stopTime = stopTime;
		this.description = description;
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStratTime() {
		return stratTime;
	}
	public void setStratTime(String stratTime) {
		this.stratTime = stratTime;
	}
	public String getStopTime() {
		return stopTime;
	}
	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
