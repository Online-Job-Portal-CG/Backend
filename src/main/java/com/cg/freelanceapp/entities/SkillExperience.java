package com.cg.freelanceapp.entities;

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
public class SkillExperience {

	@Id
	@Column(name = "skill_exp_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "skill_exp_seq")
	@GenericGenerator(name = "skill_exp_seq", strategy = "increment")
	Long id;

	@OneToOne(cascade = CascadeType.ALL)
	Skill skill;
	
	Integer years;

	@ManyToOne(targetEntity = Freelancer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "freelancer_id")
	Freelancer freelancer;

	public SkillExperience() {
		super();
	}

	public SkillExperience(Long id, Skill skill, Integer years, Freelancer freelancer) {
		super();
		this.id = id;
		this.skill = skill;
		this.years = years;
		this.freelancer = freelancer;
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

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

}
