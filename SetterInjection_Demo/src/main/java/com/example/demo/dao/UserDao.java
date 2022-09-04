package com.example.demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("abc")
public class UserDao implements IuserDao{

	@Override
	public String findByName(Integer uid) {

		return "This is UserDao class";
	}

	
}
