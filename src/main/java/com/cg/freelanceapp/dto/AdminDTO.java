package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;

/**
 * 
 * @author      Vishnuvardhan Reddy
 * Description: This is the DTO class for Admin module
 *
 */
public class AdminDTO {

	@NotEmpty(message = "userName cant be empty")
	private String userName;
	@NotEmpty(message = "firstName cant be empty")
	private String firstName;
	@NotEmpty(message = "lastName cant be empty")
	private String lastName;
	@NotEmpty(message = "Password cant be empty")
	private String password;

	public AdminDTO() {
		super();
	}

	public AdminDTO(String userName, String firstName, String lastName, String password) {
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

	@Override
	public String toString() {
		return "AdminDTO [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + "]";
	}

}
