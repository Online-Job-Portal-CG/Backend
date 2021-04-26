package com.cg.freelanceapp.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for Job module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
public class Job implements Serializable {

	private static final long serialVersionUID = -7946011744287965252L;

	@Id
	@Column(name = "job_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "job_seq")
	@SequenceGenerator(name = "job_seq", sequenceName = "job_seq", allocationSize = 1)
	Long id;

	@OneToOne(cascade = CascadeType.ALL)
	Skill skill;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "recruiter_id")
	Recruiter postedBy;

	LocalDate postedDate;

	@OneToOne(cascade = CascadeType.ALL)
	Freelancer awardedTo;

//	@OneToMany(mappedBy = "job", targetEntity = JobApplication.class, cascade = CascadeType.ALL)
//	List<JobApplication> jobApplications;

	Boolean active;

	public Job() {
		super();
	}

	public Job(Skill skill, Recruiter postedBy, LocalDate postedDate, Freelancer awardedTo, Boolean active) {
		super();
		this.skill = skill;
		this.postedBy = postedBy;
		this.postedDate = postedDate;
		this.awardedTo = awardedTo;
		this.active = active;
	}

	public Boolean getActive() {
		return active;
	}

	public Freelancer getAwardedTo() {
		return awardedTo;
	}

	public Long getId() {
		return id;
	}

	public Recruiter getPostedBy() {
		return postedBy;
	}

	public LocalDate getPostedDate() {
		return postedDate;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public void setAwardedTo(Freelancer awardedTo) {
		this.awardedTo = awardedTo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPostedBy(Recruiter postedBy) {
		this.postedBy = postedBy;
	}

//	public List<JobApplication> getJobApplications() {
//		return jobApplications;
//	}
//
//	public void setJobApplications(List<JobApplication> jobApplications) {
//		this.jobApplications = jobApplications;
//	}

	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}
