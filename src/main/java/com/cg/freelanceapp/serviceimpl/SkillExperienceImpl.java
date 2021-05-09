package com.cg.freelanceapp.serviceimpl;
/****************************************************
 * Method :SkillExperience
 * Method
 *@param skillExperienceDto
 * @throws IdNotFoundException
 * Description: This method creates a skillExperience for a particular skill for a freelancer
 ****************************************************/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dao.ISkillExperienceDao;
import com.cg.freelanceapp.dto.SkillExperienceDTO;
import com.cg.freelanceapp.entities.SkillExperience;
import com.cg.freelanceapp.exceptions.InvalidSkillExperienceException;
import com.cg.freelanceapp.service.ISkillExperienceService;

@Service
public class SkillExperienceImpl implements ISkillExperienceService {
	
	
	@Autowired
	ISkillExperienceDao skillExperienceDao;
	@Autowired
	ISkillDao skillDao;
	@Autowired
	IFreelancerDao freelancerDao;
	
	@Transactional
	@Override
	public SkillExperience addSkill(SkillExperienceDTO skillExperienceDto) {
		SkillExperience skillExperience= new SkillExperience();
		skillExperience.setYears(skillExperienceDto.getYears());
		skillExperience.setFreelancer(freelancerDao.findById(skillExperienceDto.getFreelancerId()).get());
		skillExperience.setSkill(skillDao.findById(skillExperienceDto.getSkillId()).get());
		return skillExperienceDao.save(skillExperience);
	}

	@Override
	public void updateSkillYears(Long id, Integer years) {
		 if(skillExperienceDao.existsById(id)) {
			 SkillExperience skillExperience  = skillExperienceDao.findById(id).get();
			 skillExperience.setYears(years);
			 skillExperienceDao.save(skillExperience);
		  }
		 else throw new InvalidSkillExperienceException();
	}

	@Override
	public SkillExperience getSkillById(Long id) {
		 if(skillExperienceDao.existsById(id)) {
			return skillExperienceDao.findById(id).get();
		  }
		 else throw new InvalidSkillExperienceException();
	}
}