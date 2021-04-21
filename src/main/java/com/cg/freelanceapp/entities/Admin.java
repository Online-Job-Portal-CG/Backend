package com.cg.freelanceapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Admin {

	@Id
	
	@Column(name = "admin_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "admin_seq")
	@GenericGenerator(name = "admin_seq", strategy = "increment")
	Long id;
	
	@Column(updatable = false)
	String firstName;
	@Column(updatable = false)
	String lastName;
	@Column(updatable = false, nullable = false)
	String password;

	public Admin() {
		super();
	}

	public Admin(Long id, String firstName, String lastName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
