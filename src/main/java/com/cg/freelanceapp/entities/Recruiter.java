package com.cg.freelanceapp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for Recruiter module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Recruiter implements Serializable {
	
	private static final long serialVersionUID = -5589762242678036127L;

	@Id
	@Column(name = "recruiter_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "recruiter_seq")
	@SequenceGenerator(name = "recruiter_seq", sequenceName = "recruiter_seq", allocationSize = 1)
	Long id;

	String firstName;
	String lastName;

	@OneToMany(mappedBy = "postedBy", targetEntity = Job.class)
	List<Job> postedJobs;

	@OneToMany(mappedBy = "createdBy", targetEntity = Feedback.class)
	List<Feedback> feedbacks;

	@OneToMany(mappedBy = "bookmarkedBy", targetEntity = BookmarkedFreelancer.class)
	List<BookmarkedFreelancer> freelancers;

	public Recruiter() {
		super();
	}

	public Recruiter(Long id, String firstName, String lastName, List<Job> postedJobs, List<Feedback> feedbacks,
			List<BookmarkedFreelancer> freelancers) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postedJobs = postedJobs;
		this.feedbacks = feedbacks;
		this.freelancers = freelancers;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public String getFirstName() {
		return firstName;
	}

	public List<BookmarkedFreelancer> getFreelancers() {
		return freelancers;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Job> getPostedJobs() {
		return postedJobs;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFreelancers(List<BookmarkedFreelancer> freelancers) {
		this.freelancers = freelancers;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPostedJobs(List<Job> postedJobs) {
		this.postedJobs = postedJobs;
	}

}
