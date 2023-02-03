package com.belcode.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belcode.app.ws.shared.Utils;
import com.belcode.app.ws.user.ui.model.Response.UserRest;
import com.belcode.app.ws.user.ui.model.request.UserDetailsRequestModel;
import com.belcode.app.ws.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	Map<String, UserRest> users;
		
	Utils utils;
	
	public UserServiceImpl() {}
	
	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils = utils;
	}
	
	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {

				
		UserRest returnedUser = new UserRest();
		returnedUser.setFirstName(userDetails.getFirstName());
		returnedUser.setLastName(userDetails.getLastName());
		returnedUser.setEmail(userDetails.getEmail());		
		
		String userId = utils.generateUserId();

		if(users == null) users = new HashMap<>();
		returnedUser.setUserId(userId);
		users.put(userId, returnedUser);
		
		return returnedUser;
	}


}
