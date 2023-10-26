package com.example.demo.company;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class company {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int no;
	@Column(name="Company Name")
	private String companyName;
	@Column(name="Contact Number")
	private String contactno;
	@Column(name="HR Name")
	private String hrName;
	@Column(name="HR Number")
	private String hrno;
	@Column(name="Location")
	private String location;
	@Column(name="Website")
	private String website;
	@Column(name="Email ID")
	private String emailId;
	@Column(name="Interview Method")
	private String interview;
	

	
	public company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public company(String companyName, String contactno, String hrName, String hrno, String location, String website,
			String emailId, String interview) {
		super();
		this.companyName = companyName;
		this.contactno = contactno;
		this.hrName = hrName;
		this.hrno = hrno;
		this.location = location;
		this.website = website;
		this.emailId = emailId;
		this.interview = interview;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyNo() {
		return contactno;
	}
	public void setCompanyNo(String contactno) {
		this.contactno = contactno;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getHrno() {
		return hrno;
	}
	public void setHrno(String hrno) {
		this.hrno = hrno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getInterview() {
		return interview;
	}
	public void setInterview(String interview) {
		this.interview = interview;
	}
	
	
	
	
	

}
