package com.example.demo.userId;


import java.sql.Date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity

public class user {
		
	
	@Id
	private long no;
	private String userId;
	private String password;
	
	
		
	
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
	

	public user(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
		
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
			
}
