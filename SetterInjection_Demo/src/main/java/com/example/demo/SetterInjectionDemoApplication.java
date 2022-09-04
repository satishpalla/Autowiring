package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.UserService;

@SpringBootApplication
public class SetterInjectionDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(SetterInjectionDemoApplication.class, args);
	 UserService service=cac.getBean(UserService.class);
	service.getName(101);
	}

}
