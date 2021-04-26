package com.cg.freelanceapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for Admin module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
public class Admin implements Serializable {

	private static final long serialVersionUID = -3376723589710738177L;

	@Id
	@Column(name = "admin_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "admin_seq")
	@SequenceGenerator(name = "admin_seq", sequenceName = "admin_seq", allocationSize = 1)
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

	public Admin(String firstName, String lastName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
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

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
