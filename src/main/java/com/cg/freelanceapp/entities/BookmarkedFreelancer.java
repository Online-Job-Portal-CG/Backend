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

import org.hibernate.annotations.GenericGenerator;


@Entity
public class BookmarkedFreelancer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="bkd_fr_seq")
	@GenericGenerator(name = "bkd_fr_seq", strategy="increment")
	@Column(name = "bkd_fr_id", updatable = false)
	Long id;

	@OneToOne
	Skill skill;

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Freelancer.class)
	@JoinColumn(name = "freelancer_id")
	Freelancer freelancer;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Recruiter.class)
	@JoinColumn(name = "recruiter_id")
	Recruiter bookmarkedBy;

	public BookmarkedFreelancer() {
		super();
	}

	public BookmarkedFreelancer(Long id, Skill skill, Freelancer freelancer, Recruiter bookmarkedBy) {
		super();
		this.id = id;
		this.skill = skill;
		this.freelancer = freelancer;
		this.bookmarkedBy = bookmarkedBy;
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
	
	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public Recruiter getBookmarkedBy() {
		return bookmarkedBy;
	}

	public void setBookmarkedBy(Recruiter bookmarkedBy) {
		this.bookmarkedBy = bookmarkedBy;
	}

}
