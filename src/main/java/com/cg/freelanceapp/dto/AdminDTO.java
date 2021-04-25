package com.cg.freelanceapp.dto;

/**
 * 
 * @author      Vishnuvardhan Reddy
 * Description: This is the DTO class for Admin module
 *
 */
public class AdminDTO {
	private String firstName;
	private String lastName;
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
