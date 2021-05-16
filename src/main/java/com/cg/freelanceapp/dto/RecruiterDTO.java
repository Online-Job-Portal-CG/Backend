package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the DTO class for Recruiter module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class RecruiterDTO {
	@NotEmpty(message="first name cannot be empty")
	private String firstName;
	@NotEmpty(message="last name cannot be empty")
	private String lastName;
	@NotEmpty(message="password cannot be blank")
	private String password;

	public RecruiterDTO() {
		super();
	}

	public RecruiterDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
