package com.belcode.app.ws.user.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	@NotEmpty(message = "firstName cannot be empty")
	@Size(min=2, message = "firstName must not be less than 2 characters")
	private String firstName;
	
	@NotEmpty(message = "lastName cannot be empty")
	@Size(min=2, message = "lastName must not be less than 2 characters")
	private String lastName;
	
	@NotEmpty(message = "email cannot be empty")
	@Email
	private String email;
	
	@NotEmpty(message = "password cannot be empty")
	@Size(min = 8, max = 16, message = "Password must be between 8 and 16 characters")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
