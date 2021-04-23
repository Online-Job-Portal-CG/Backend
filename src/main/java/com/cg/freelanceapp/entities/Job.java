package com.cg.freelanceapp.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Job {
	@Id
	@Column(name = "job_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "job_seq")
	@GenericGenerator(name = "job_seq", strategy = "increment")
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

	public Job(Long id, Skill skill, Recruiter postedBy, LocalDate postedDate, Freelancer awardedTo
//			, List<JobApplication> jobApplications
			, Boolean active) {
		super();
		this.id = id;
		this.skill = skill;
		this.postedBy = postedBy;
		this.postedDate = postedDate;
		this.awardedTo = awardedTo;
//		this.jobApplications = jobApplications;
		this.active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Recruiter getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(Recruiter postedBy) {
		this.postedBy = postedBy;
	}

	public LocalDate getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}

	public Freelancer getAwardedTo() {
		return awardedTo;
	}

	public void setAwardedTo(Freelancer awardedTo) {
		this.awardedTo = awardedTo;
	}

//	public List<JobApplication> getJobApplications() {
//		return jobApplications;
//	}
//
//	public void setJobApplications(List<JobApplication> jobApplications) {
//		this.jobApplications = jobApplications;
//	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
