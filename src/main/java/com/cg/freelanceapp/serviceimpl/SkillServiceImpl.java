package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.ISkillService;

@Service
public class SkillServiceImpl implements ISkillService {

	@Autowired
	ISkillDao skillDao;

	@Override
	public Skill save(Skill skill) {

		return skillDao.save(skill);
	}

	@Override
	public void remove(Skill skill) {
		skillDao.delete(skill);
	}

	@Override
	public Skill update(Skill skill) {
		return skillDao.save(skill);
	}

}
