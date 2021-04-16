package com.cg.freelanceapp.dao;

import com.cg.freelanceapp.entities.Skill;

public interface ISkillDao {

	Skill save(Skill skill);
	void remove(Skill skill);
	Skill update(Skill skill);
	
}
