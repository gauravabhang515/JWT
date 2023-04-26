package com.csi;

import com.csi.model.User;
import com.csi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

	@Autowired
	UserServiceImpl userServiceImpl;
	@PostConstruct

	public void saveData(){
		User user=new User(121,"Gaurav","Gaura@cs","GG");
		userServiceImpl.saveData(user);
	}

}
