package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.ISkillService;

/**************************************************************************************
 * @author Vishnuvardhan 
 * Description: This is the rest controller class for Skill module. 
 * Created Date: 20 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/

@RestController
@RequestMapping("/skills")
public class SkillController {
	@Autowired
	ISkillService skillService;

	/*****************************************************************************************
	 * Method      : save       
	 * @param        skill
	 * @return       Response Entity of Object type
	 * Description : This method adds a new freelancer.
	 * @postmapping: Post mapping requests a body from the user
	 * 				 which is then persisted onto the database.
	 ****************************************************************************************/
	@PostMapping("/add")
	public ResponseEntity<Object> save(@RequestBody Skill skill) {
		skillService.save(skill);
		return new ResponseEntity<>("Added Successfully", HttpStatus.OK);
	}
}
