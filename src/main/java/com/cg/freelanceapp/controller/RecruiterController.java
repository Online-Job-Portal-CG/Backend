package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.cg.freelanceapp.entities.Recruiter;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.freelanceapp.service.IRecruiterService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
	
	@Autowired
	IRecruiterService recruiterService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addRecruiter(@RequestBody Recruiter recruiter){
		recruiterService.save(recruiter);
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);
	}
}
