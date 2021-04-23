package com.cg.freelanceapp.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class JobApplication {
	@Id
	@Column(name = "job_app_id", updatable=false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "job_app_seq")
	@GenericGenerator(name = "job_app_seq", strategy = "increment")
	Long id;

	@ManyToOne(targetEntity = Job.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id")
	Job job;

	LocalDateTime appliedDate;

	String coverLetter;

	public JobApplication() {
		super();
	}

	public JobApplication(Long id, Job job, LocalDateTime appliedDate, String coverLetter) {
		super();
		this.id = id;
		this.job = job;
		this.appliedDate = appliedDate;
		this.coverLetter = coverLetter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public LocalDateTime getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDateTime appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

}
