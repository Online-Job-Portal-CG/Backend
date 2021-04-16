package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.entities.SkillExperience;

public interface ISkillExperienceService {
	
	SkillExperience addSkill(Skill skill, Freelancer freelancer, int experienceYears);
	
	SkillExperience updateSkillYears(Skill skill, Freelancer freelancer, int experience);
}
