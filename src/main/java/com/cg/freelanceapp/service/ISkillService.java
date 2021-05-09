package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.SkillDTO;
import com.cg.freelanceapp.entities.Skill;

/**************************************************************************************
 * @author       Amruth N 
 * Description : This is the Service Interface for SkillService module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface ISkillService {

	Skill save(SkillDTO skillDto);

	Skill save(Skill skill);

	String remove(Long id);

	Skill update(Long id, Skill skill);

	Skill findById(Long id);

	Skill getSkill(Long id);

	List<Skill> getAllSkills();

	Long getCurrentId();

}
