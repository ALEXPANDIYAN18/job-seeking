package com.example.demo.userTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class userTime {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	int no;
	String userName;
	String loginTime;
	
	
	
	
	
	public userTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userTime(String userName, String loginTime) {
		super();
		this.userName = userName;
		this.loginTime = loginTime;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	

}
