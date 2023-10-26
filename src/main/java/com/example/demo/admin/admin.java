package com.example.demo.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class admin {
	
	


	@Id
	
	private long no;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	private String adminName;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	private String psw;
	
	public admin() {
		// TODO Auto-generated constructor stub
	}
	public admin(String adminName, String psw) {
		super();
		this.adminName = adminName;
		this.psw = psw;
	}
	
}
