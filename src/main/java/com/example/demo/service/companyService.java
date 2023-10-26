package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.company.company;
import com.example.demo.repos.companyRepository;
import com.example.demo.userId.user;

public class companyService {
	@Autowired 
	public companyRepository cr;
	
	public void saveData(company cmy) {
		cr.save(cmy);
	}
	public List<company> getDetails(){
		return cr.findAll();
	}
	public company getcompanyId(int no) {
		return cr.findById(no).get();
	}

}
