package com.cg.freelanceapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.ISkillService;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Implementation for Skill module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
@Transactional
public class SkillServiceImpl implements ISkillService {

	@Autowired
	ISkillDao skillDao;

	@Override
	public Skill findById(Long id) {
		return skillDao.findById(id).get();
	}

	@Override
	public void remove(Skill skill) {
		skillDao.delete(skill);
	}

	@Override
	public Skill save(Skill skill) {

		return skillDao.save(skill);
	}

	@Override
	public Skill update(Skill skill) {
		return skillDao.save(skill);
	}
	
	/*******************************************************************************************
	 * Method:      getCurrentSeriesId
	 * @param       none
	 * @return      Long
	 * Description: This method returns the current value of primary key from the sequence.
	 *******************************************************************************************/
	@Override
	public Long getCurrentId() {
		return skillDao.getCurrentSeriesId();
	}

}
