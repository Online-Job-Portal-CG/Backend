package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the DTO class for Freelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class FreelancerDTO {
	@NotEmpty(message = "userName cannot be empty")
	private String userName;
	@NotEmpty(message = "firstName cannot be empty")
	private String firstName;
	@NotEmpty(message = "lastName cannot be empty")
	private String lastName;
	@NotEmpty(message = "password cannot be empty")
	private String password;

	public FreelancerDTO() {
		super();
	}

	public FreelancerDTO(String userName, String firstName, String lastName, String password) {
		super();
		this.userName = userName;
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

	public String getUserName() {
		return userName;
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

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
