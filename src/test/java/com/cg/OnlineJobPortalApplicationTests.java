package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;
import com.cg.freelanceapp.service.IFreelancerService;
import com.cg.freelanceapp.service.IRecruiterService;
import com.cg.freelanceapp.service.ISkillService;

@SpringBootTest
class OnlineJobPortalApplicationTests {

	@Autowired
	ISkillService skillService;

	@Autowired
	IBookmarkedFreelancerService bookmarkedFreelancerService;

	@Autowired
	IRecruiterService recruiterService;

	@Autowired
	IFreelancerService freelancerService;

	@Test
	void testAddSkill() {

		Skill skill = new Skill("java", "java skill");
		skillService.save(skill);
		Long id = skillDao.getCurrentSeriesId();
		assertEquals("java skill", skillService.findById(id).getDescription());

	}

}
