package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.SkillExperience;

public interface ISkillExperienceDao {
	
	SkillExperience save(SkillExperience experience);
	
	SkillExperience update(SkillExperience experience);
	
	void remove(SkillExperience experience);
	
}
