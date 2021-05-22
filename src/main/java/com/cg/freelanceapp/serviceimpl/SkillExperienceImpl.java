package com.cg.freelanceapp.serviceimpl;

import java.util.List;

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
import com.cg.freelanceapp.dto.SkillExperienceListDTO;
import com.cg.freelanceapp.entities.SkillExperience;
import com.cg.freelanceapp.exceptions.InvalidSkillExperienceException;
import com.cg.freelanceapp.service.ISkillExperienceService;

@Service
@Transactional
public class SkillExperienceImpl implements ISkillExperienceService {

	@Autowired
	ISkillExperienceDao skillExperienceDao;
	@Autowired
	ISkillDao skillDao;
	@Autowired
	IFreelancerDao freelancerDao;

	@Override
	public SkillExperience addSkill(SkillExperienceDTO skillExperienceDto) {
		SkillExperience skillExperience = new SkillExperience();
		skillExperience.setYears(skillExperienceDto.getYears());
		skillExperience.setFreelancer(freelancerDao.findById(skillExperienceDto.getFreelancerId()).get());
		skillExperience.setSkill(skillDao.findById(skillExperienceDto.getSkillId()).get());
		return skillExperienceDao.save(skillExperience);
	}

	@Override
	public List<SkillExperienceListDTO> getSkillByFreelancerId(Long id) {
		if (freelancerDao.existsById(id)) {
			return skillExperienceDao.findByFreelancerId(id);
		} else
			throw new InvalidSkillExperienceException();
	}

	@Override
	public void updateSkillYears(Long id, Long freelancerId, Integer years) {
		if (skillExperienceDao.existsById(id)) {
			SkillExperience skillExperience = skillExperienceDao.findBySkillIdAndFreelancerId(id, freelancerId);
			skillExperience.setYears(years);
			skillExperienceDao.save(skillExperience);
		} else
			throw new InvalidSkillExperienceException();
	}

	@Override
	public SkillExperience getSkillById(Long id) {
		if (skillExperienceDao.existsById(id)) {
			return skillExperienceDao.findById(id).get();
		} else {
			throw new InvalidSkillExperienceException();
		}
	}

	@Override
	public List<SkillExperience> getByFreelancer(Long id) {
		if (freelancerDao.existsById(id)) {
			return skillExperienceDao.findByFreelancer(id);
		} else
			throw new InvalidSkillExperienceException();
	}
}