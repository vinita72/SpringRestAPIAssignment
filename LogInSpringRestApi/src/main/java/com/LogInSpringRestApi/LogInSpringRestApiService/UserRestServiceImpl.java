package com.LogInSpringRestApi.LogInSpringRestApiService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.LogInSpringRestApi.LogInSpringRestApiRepository.UserDetails;

@Service
public class UserRestServiceImpl implements UserRestService {

	List<UserDetails> users;

	public UserRestServiceImpl() {
		users = new ArrayList<>();
		users.add(new UserDetails("Vachi", "xyz122314"));
		users.add(new UserDetails("Sam", "abcdrer3334"));
		users.add(new UserDetails("Harry", "Potterhead223"));
		users.add(new UserDetails("Ron", "RonHarry32312"));
		users.add(new UserDetails("Monica", "heythere2332"));
		users.add(new UserDetails("Ross", "password1234"));
	}

	@Override
	public String checkout(UserDetails u1) {
		for (UserDetails u : users)
			{
		  if(u.getUsername().matches(u1.getUsername()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

	
}
