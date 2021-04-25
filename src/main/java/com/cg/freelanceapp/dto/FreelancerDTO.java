package com.cg.freelanceapp.dto;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the DTO class for Freelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class FreelancerDTO {
	private String firstName;
	private String lastName;
	private String password;

	public FreelancerDTO() {
		super();
	}

	public FreelancerDTO(String firstName, String lastName, String password) {
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
