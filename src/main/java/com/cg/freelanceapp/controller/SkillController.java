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

@RestController
@RequestMapping("/skills")
public class SkillController {
	@Autowired
	ISkillService skillService;

	@PostMapping("/add")
	public ResponseEntity<String> save(@RequestBody Skill skill) {
		skillService.save(skill);
		return new ResponseEntity<String>("Added Successfully", HttpStatus.OK);
	}
}
