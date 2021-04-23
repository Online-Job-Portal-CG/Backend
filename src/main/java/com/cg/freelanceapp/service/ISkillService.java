package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Skill;

@Service
public interface ISkillService {

	Skill save(Skill skill);

	void remove(Skill skill);

	Skill update(Skill skill);
	
	Skill findById(Long id);

}
