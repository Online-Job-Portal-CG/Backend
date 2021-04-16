package com.cg.freelanceapp.service;

import com.cg.freelanceapp.entities.Skill;

public interface ISkillService {

	Skill save(Skill skill);

	void remove(Skill skill);

	Skill update(Skill skill);

}
