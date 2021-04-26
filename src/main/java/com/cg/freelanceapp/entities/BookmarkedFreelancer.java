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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the BookmarkedFreelancer class for Admin module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class BookmarkedFreelancer implements Serializable {

	private static final long serialVersionUID = 9145091598260400574L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "bkd_fr_seq")
	@SequenceGenerator(name = "bkd_fr_seq", sequenceName = "bkd_fr_seq", allocationSize = 1)
	@Column(name = "bkd_fr_id", updatable = false)
	private Long id;

	@OneToOne(targetEntity = Skill.class, cascade = CascadeType.PERSIST)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@NotNull(message = "Skill id should not be empty.")
	private Skill skill;

	@OneToOne(targetEntity = Freelancer.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "freelancer_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@NotNull(message = "Freelancer id should not be empty.")
	private Freelancer freelancer;

	@ManyToOne(targetEntity = Recruiter.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "recruiter_id")
	@OnDelete(action = OnDeleteAction.CASCADE)
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

	public Recruiter getBookmarkedBy() {
		return bookmarkedBy;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public Long getId() {
		return id;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setBookmarkedBy(Recruiter bookmarkedBy) {
		this.bookmarkedBy = bookmarkedBy;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "BookmarkedFreelancer [id=" + id + ", skill=" + skill + ", freelancer=" + freelancer + ", bookmarkedBy="
				+ bookmarkedBy + "]";
	}

}
