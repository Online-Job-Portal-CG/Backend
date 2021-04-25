package com.cg.freelanceapp.dto;

public class RecruiterDTO {
	private String firstName;
	private String lastName;

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
