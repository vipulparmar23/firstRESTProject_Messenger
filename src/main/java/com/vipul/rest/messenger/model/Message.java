package com.vipul.rest.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;	

@XmlRootElement
public class Message {

	private long id;
	private String author;
	private String message;
	private Date createdOn;
	
	
	public Message() {
		
	}
	
	public Message(long id, String message, String author) {
		this.createdOn = new Date();
		this.id = id;
		this.author = author;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
}
