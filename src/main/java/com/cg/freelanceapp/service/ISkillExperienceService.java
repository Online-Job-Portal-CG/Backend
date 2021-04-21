package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.entities.SkillExperience;

@Service
public interface ISkillExperienceService {
	
	SkillExperience addSkill(Skill skill, Freelancer freelancer, int experienceYears);
	
	SkillExperience updateSkillYears(Skill skill, Freelancer freelancer, int experience);
}
