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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Entity class for SkillExperience module. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class SkillExperience implements Serializable {

	private static final long serialVersionUID = -8047471705942110842L;

	@Id
	@Column(name = "skill_exp_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "skill_exp_seq")
	@SequenceGenerator(name = "skill_exp_seq", sequenceName = "skill_exp_seq", allocationSize = 1)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Skill skill;

	private Integer years;

	@ManyToOne(targetEntity = Freelancer.class, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
			CascadeType.DETACH })
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "freelancer_id")
	private Freelancer freelancer;

	public SkillExperience() {
		super();
	}

	public SkillExperience(Skill skill, Integer years, Freelancer freelancer) {
		super();
		this.skill = skill;
		this.years = years;
		this.freelancer = freelancer;
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

	public Integer getYears() {
		return years;
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

	public void setYears(Integer years) {
		this.years = years;
	}

}
