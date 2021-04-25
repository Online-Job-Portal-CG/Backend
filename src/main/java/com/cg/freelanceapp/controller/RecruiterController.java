package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.freelanceapp.dto.RecruiterDTO;
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
	public ResponseEntity<String> addRecruiter(@RequestBody RecruiterDTO recruiterDto) {
		recruiterService.save(recruiterDto);
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);
	}

	@GetMapping("/getById/{id}")
	public Recruiter getById(@PathVariable Long id) {
		return recruiterService.findById(id);
	}

}
