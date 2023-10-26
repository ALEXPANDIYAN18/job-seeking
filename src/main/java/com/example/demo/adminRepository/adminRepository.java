package com.example.demo.adminRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.admin.admin;


@EnableJpaRepositories
public interface adminRepository extends JpaRepository<admin,Long>{
	
	admin findByAdminNameAndPsw(String adminName,String adminPassword);

	}
