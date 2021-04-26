package com.cg.freelanceapp.entities;

import java.io.Serializable;

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
 * Description : This is the Entity class for BookmarkedJob module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
public class BookmarkedJob implements Serializable {

	private static final long serialVersionUID = 216468327513376764L;

	@Id
	@Column(name = "bkd_job_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bkd_job_seq")
	@SequenceGenerator(name = "bkd_job_seq", sequenceName = "bkd_job_seq", allocationSize = 1)
	Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "skill_id")
	Skill skill;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id")
	Job job;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
	Freelancer freelancer;

	public BookmarkedJob() {
		super();
	}

	public BookmarkedJob(Skill skill, Job job, Freelancer freelancer) {
		super();
		this.skill = skill;
		this.job = job;
		this.freelancer = freelancer;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public Long getId() {
		return id;
	}

	public Job getJob() {
		return job;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

}
