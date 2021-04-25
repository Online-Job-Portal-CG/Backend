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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * 
 * @author      Vishnuvardhan Reddy
 * Description: This is the entity class for BookmarkedFreelancer module
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BookmarkedFreelancer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bkd_fr_seq")
	@GenericGenerator(name = "bkd_fr_seq", strategy = "increment")
	@Column(name = "bkd_fr_id", updatable = false)
	private Long id;

	@OneToOne(targetEntity = Skill.class,cascade = CascadeType.ALL)
//	@OnDelete(action = OnDeleteAction.CASCADE)
	@NotNull(message = "Skill id should not be empty.")
	private Skill skill;

	@OneToOne(targetEntity = Freelancer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
//	@OnDelete(action = OnDeleteAction.CASCADE)
	@NotNull(message = "Freelancer id should not be empty.")
	private Freelancer freelancer;

	@ManyToOne(targetEntity = Recruiter.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "recruiter_id")
//	@OnDelete(action = OnDeleteAction.CASCADE)
	@NotNull(message = "Recruiter id should not be empty.")
	private Recruiter bookmarkedBy;

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
