package com.cg.freelanceapp.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for JobApplication module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(uniqueConstraints=@UniqueConstraint(columnNames = {"job_app_id", "freelancer_id"}))
public class JobApplication implements Serializable {

	private static final long serialVersionUID = -3361518011946574802L;

	@Id
	@Column(name = "job_app_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "job_app_seq")
	@SequenceGenerator(name = "job_app_seq", sequenceName = "job_app_seq", allocationSize = 1)
	private Long id;

	@ManyToOne(targetEntity = Job.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne(targetEntity = Freelancer.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@JoinColumn(name="freelancer_id")
	private Freelancer freelancer;

	private LocalDateTime appliedDate = LocalDateTime.now();

	private String coverLetter;

	public JobApplication() {
		super();
	}

	public JobApplication(Job job, LocalDateTime appliedDate, String coverLetter) {
		super();
		this.job = job;
		this.appliedDate = appliedDate;
		this.coverLetter = coverLetter;
	}

	public LocalDateTime getAppliedDate() {
		return appliedDate;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public Long getId() {
		return id;
	}

	public Job getJob() {
		return job;
	}

	public void setAppliedDate(LocalDateTime appliedDate) {
		this.appliedDate = appliedDate;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	

}
