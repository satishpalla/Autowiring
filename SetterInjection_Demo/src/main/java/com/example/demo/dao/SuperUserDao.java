package com.example.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class SuperUserDao implements IuserDao {

	@Override
	public String findByName(Integer uid) {
		// TODO Auto-generated method stub
		return "This is SuperUserDAo Class";
	}

}
