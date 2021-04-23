package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.ISkillService;

@SpringBootTest
class OnlineJobPortalApplicationTests {

	@Autowired
	ISkillService skillService;
	
	@Test
	void test1() {
		long id = 7;
		Skill skill = new Skill(id, "Python", "Python Skill");
		skillService.save(skill);
		System.out.println(skillService.findById(id).getName());
		assertEquals("Python", skillService.findById(id).getName());
	}

}
