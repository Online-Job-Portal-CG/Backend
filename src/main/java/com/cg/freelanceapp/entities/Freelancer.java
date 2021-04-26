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

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for Freelancer module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
public class Freelancer implements Serializable {

	private static final long serialVersionUID = -8358203589467846311L;
	@Id
	@Column(name = "freelancer_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "freelancer_seq")
	@SequenceGenerator(name = "freelancer_seq", sequenceName = "freelancer_seq", allocationSize = 1)
	Long id;
	@Column(updatable = false)
	String firstName;
	@Column(updatable = false)
	String lastName;
	@Column(updatable = false)
	String password;

	@OneToMany(targetEntity = JobApplication.class)
	List<JobApplication> appliedJobs;

	@OneToMany(mappedBy = "createdFor", targetEntity = Feedback.class)
	List<Feedback> feedbacks;

	@OneToMany(mappedBy = "freelancer", targetEntity = SkillExperience.class)
	List<SkillExperience> skills;

	@OneToMany(mappedBy = "freelancer", targetEntity = BookmarkedJob.class)
	List<BookmarkedJob> bookmarkedJobs;

	public Freelancer() {
		super();
	}

	public Freelancer(String firstName, String lastName, String password, List<JobApplication> appliedJobs,
			List<Feedback> feedbacks, List<SkillExperience> skills, List<BookmarkedJob> bookmarkedJobs) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.appliedJobs = appliedJobs;
		this.feedbacks = feedbacks;
		this.skills = skills;
		this.bookmarkedJobs = bookmarkedJobs;
	}

	public List<JobApplication> getAppliedJobs() {
		return appliedJobs;
	}

	public List<BookmarkedJob> getBookmarkedJobs() {
		return bookmarkedJobs;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
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

	public List<SkillExperience> getSkills() {
		return skills;
	}

	public void setAppliedJobs(List<JobApplication> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}

	public void setBookmarkedJobs(List<BookmarkedJob> bookmarkedJobs) {
		this.bookmarkedJobs = bookmarkedJobs;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
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

	public void setSkills(List<SkillExperience> skills) {
		this.skills = skills;
	}

}
