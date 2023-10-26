package com.example.demo.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.userId.user;
@EnableJpaRepositories

public interface userRepository extends JpaRepository<user,Long> {
	user findByuserIdAndPassword(String userId,String password);

}
