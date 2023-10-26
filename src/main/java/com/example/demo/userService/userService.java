package com.example.demo.userService;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.userId.user;
import com.example.demo.userRepository.userRepository;



@Service
public class userService {
	@Autowired
	public userRepository ur;
	
	public user login(String userId,String password) {
		user User=ur.findByuserIdAndPassword(userId,password);
		
       return User;
	}
		
}
