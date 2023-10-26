package com.example.demo.userTimeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.userTime.userTime;

public interface userTimeRepository extends JpaRepository<userTime,Integer> {

}
