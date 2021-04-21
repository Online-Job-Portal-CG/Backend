package com.cg.freelanceapp.entities;

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
public class Feedback {

	@Id
	@Column(name = "feedback_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator="feedback_seq")
	@GenericGenerator(name = "feedback_seq", strategy="increment")
	Long id;
	Integer ranges;
	String comments;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Recruiter.class)
	@JoinColumn(name = "recruiter_id")
	Recruiter createdBy;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Freelancer.class)
	@JoinColumn(name = "freelancer_id")
	Freelancer createdFor;

	public Feedback() {
		super();
	}

	public Feedback(Long id, Integer ranges, String comments, Recruiter createdBy, Freelancer createdFor) {
		super();
		this.id = id;
		this.ranges = ranges;
		this.comments = comments;
		this.createdBy = createdBy;
		this.createdFor = createdFor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRanges() {
		return ranges;
	}

	public void setRanges(Integer ranges) {
		this.ranges = ranges;
	}

	public String getComments() {
		return comments;
	}

	public void setComment(String comments) {
		this.comments = comments;
	}

	public Recruiter getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Recruiter createdBy) {
		this.createdBy = createdBy;
	}

	public Freelancer getCreatedFor() {
		return createdFor;
	}

	public void setCreatedFor(Freelancer createdFor) {
		this.createdFor = createdFor;
	}

}
