package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

/**
 * 
 * @author      Vishnuvardhan Reddy
 * Description: This is the DTO class for Admin module
 *
 */
public class AdminDTO {
	@NotEmpty(message = "firstName cant be empty")
	private String firstName;
	@NotEmpty(message = "lastName cant be empty")
	private String lastName;
	@NotEmpty(message = "Password cant be empty")
	private String password;

	public AdminDTO() {
		super();
	}

	public AdminDTO(String firstName, String lastName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
