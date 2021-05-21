package com.cg.freelanceapp.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
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
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for Job module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Job implements Serializable {

	private static final long serialVersionUID = -7946011744287965252L;

	@Id
	@Column(name = "job_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "job_seq")
	@SequenceGenerator(name = "job_seq", sequenceName = "job_seq", allocationSize = 1)
	private Long id;

	private String jobTitle;

	private String jobDescription;

	@OneToOne(targetEntity = Skill.class, cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Skill skill;

	@ManyToOne(targetEntity = Recruiter.class, cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "recruiter_id")
	private Recruiter postedBy;

	private LocalDate postedDate = LocalDate.now(ZoneId.of("GMT+05:30"));

	@OneToOne(targetEntity = Freelancer.class, cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Freelancer awardedTo;

	@OneToMany(mappedBy = "job", targetEntity = JobApplication.class, cascade = { CascadeType.MERGE,
			CascadeType.REFRESH })
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<JobApplication> jobApplications;

	private Boolean active;

	public Job() {
		super();
	}

	public Job(Long id, String jobTitle, String jobDescription, Skill skill, Recruiter postedBy, LocalDate postedDate,
			Freelancer awardedTo, List<JobApplication> jobApplications, Boolean active) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.skill = skill;
		this.postedBy = postedBy;
		this.postedDate = postedDate;
		this.awardedTo = awardedTo;
		this.jobApplications = jobApplications;
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

	public List<JobApplication> getJobApplications() {
		return jobApplications;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public String getJobTitle() {
		return jobTitle;
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

	public void setJobApplications(List<JobApplication> jobApplications) {
		this.jobApplications = jobApplications;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setPostedBy(Recruiter postedBy) {
		this.postedBy = postedBy;
	}

	public void setPostedDate(LocalDate postedDate) {
		this.postedDate = postedDate;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	

}
