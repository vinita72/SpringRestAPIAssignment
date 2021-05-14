package com.LogInSpringRestApi.LogInSpringRestApiController;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.LogInSpringRestApi.LogInSpringRestApiRepository.UserDetails;

@RestController
public class LogInRestController {

	
	@Autowired
	UserDetails s;
	@PostMapping("/login")

	public String checkUser(@RequestBody UserDetails u1)
	{
		System.out.println(u1.getUsername()+" "+u1.getPassword());
		return s.checkout(u1);
		
	}
}
