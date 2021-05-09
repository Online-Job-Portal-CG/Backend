package com.cg.freelanceapp.service;
/**************************************************************************************
 * @author       Amruth N 
 * Description : This is the Service Interface for SkillExperience module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
import com.cg.freelanceapp.dto.SkillExperienceDTO;
import com.cg.freelanceapp.entities.SkillExperience;

public interface ISkillExperienceService {
	
	public  void updateSkillYears(Long id, Integer years);

	public SkillExperience addSkill(SkillExperienceDTO skillExperienceDto);
	
	public SkillExperience getSkillById(Long id);
}