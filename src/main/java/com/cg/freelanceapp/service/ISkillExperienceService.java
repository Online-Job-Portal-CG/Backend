package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.SkillExperience;

public interface ISkillExperienceService {
	
	SkillExperience save(SkillExperience experience);
	
	SkillExperience update(SkillExperience experience);
	
	void remove(SkillExperience experience);
	
}
