package com.belcode.app.ws.user.ui.model.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

	@NotEmpty(message = "firstName cannot be empty")
	@Size(min=2, message = "firstName must not be less than 2 characters")
	private String firstName;
	
	@NotEmpty(message = "lastName cannot be empty")
	@Size(min=2, message = "lastName must not be less than 2 characters")
	private String lastName;

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

}
