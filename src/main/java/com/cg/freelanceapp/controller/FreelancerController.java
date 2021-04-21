package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.service.IFreelancerService;

@RestController
@RequestMapping("/freelancer")
public class FreelancerController {

	@Autowired
	IFreelancerService freelancerService;

	@PostMapping("/add")
	public ResponseEntity<String> addFreelancer(@RequestBody Freelancer freelancer) {
		freelancerService.save(freelancer);
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);
	}
}
