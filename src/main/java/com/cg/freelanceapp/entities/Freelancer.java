package com.cg.freelanceapp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Freelancer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "freelancer_id", updatable = false)
	Long id;
	@Column(updatable = false)
	String firstName;
	@Column(updatable = false)
	String lastName;
	@Column(updatable = false)
	String password;

	@OneToMany
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

	public Freelancer(Long id, String firstName, String lastName, String password, List<JobApplication> appliedJobs,
			List<Feedback> feedbacks, List<SkillExperience> skills, List<BookmarkedJob> bookmarkedJobs) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.appliedJobs = appliedJobs;
		this.feedbacks = feedbacks;
		this.skills = skills;
		this.bookmarkedJobs = bookmarkedJobs;
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

	public List<JobApplication> getAppliedJobs() {
		return appliedJobs;
	}

	public void setAppliedJobs(List<JobApplication> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}

	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public List<SkillExperience> getSkills() {
		return skills;
	}

	public void setSkills(List<SkillExperience> skills) {
		this.skills = skills;
	}

	public List<BookmarkedJob> getBookmarkedJobs() {
		return bookmarkedJobs;
	}

	public void setBookmarkedJobs(List<BookmarkedJob> bookmarkedJobs) {
		this.bookmarkedJobs = bookmarkedJobs;
	}

}
