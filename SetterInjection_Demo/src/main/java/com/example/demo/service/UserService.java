package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IuserDao;

@Service
public class UserService {
private IuserDao iuser;
@Autowired
@Qualifier("abc")
public void setUserdao(IuserDao iuser) {
	this.iuser = iuser;
}


public void getName(Integer id)
{
	String s=iuser.findByName(id);
System.out.println(s);
}
	
}
