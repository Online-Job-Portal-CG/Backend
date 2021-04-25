package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.entities.Skill;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Interface for Skill module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface ISkillService {

	Skill findById(Long id);

	void remove(Skill skill);

	Skill save(Skill skill);

	Skill update(Skill skill);

}
