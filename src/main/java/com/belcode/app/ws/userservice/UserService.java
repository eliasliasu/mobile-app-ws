package com.belcode.app.ws.userservice;

import com.belcode.app.ws.user.ui.model.Response.UserRest;
import com.belcode.app.ws.user.ui.model.request.UserDetailsRequestModel;

public interface UserService  {
	
	public UserRest createUser(UserDetailsRequestModel userDetails);

}
