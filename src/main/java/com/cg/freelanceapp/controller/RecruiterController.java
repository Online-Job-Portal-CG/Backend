package com.cg.freelanceapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.RecruiterDTO;
import com.cg.freelanceapp.entities.Recruiter;
import com.cg.freelanceapp.exceptions.InvalidRecruiterException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.IRecruiterService;

@RestController
@RequestMapping("/recruiter")
@CrossOrigin(origins = "*")
public class RecruiterController {

	@Autowired
	IRecruiterService recruiterService;

	@PostMapping("/add")
	public ResponseEntity<Object> createRecruiter(@Valid @RequestBody RecruiterDTO recruiterDto,
			BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new JobPortalValidationException(errMessages);
		}
		try {
			recruiterService.save(recruiterDto);
		} catch (InvalidRecruiterException exception) {
			throw new InvalidRecruiterException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/get/id/{id}")
	public Recruiter getById(@PathVariable Long id) {
		try {
			return recruiterService.findById(id);
		} catch (InvalidRecruiterException exception) {
			throw new InvalidRecruiterException("Recruiter with given id not found");
		}
	}
	
	@GetMapping("/get/name/{userName}")
	public Recruiter getByUserName(@PathVariable String userName) {
		try {
			return recruiterService.findByUserName(userName);
		} catch (InvalidRecruiterException exception) {
			throw new InvalidRecruiterException("Recruiter with userName not found");
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateRecruiter(@Valid @PathVariable Long id,
			@RequestBody RecruiterDTO recruiterDto) {
		try {
			recruiterService.update(id, recruiterDto);
		} catch (InvalidRecruiterException exception) {
			throw new InvalidRecruiterException("Recruiter with given id not found");
		}
		return new ResponseEntity<>("Updated Recruiter Successfully", HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<Object> findAll(){
		return new ResponseEntity<>(recruiterService.findAll(), HttpStatus.OK);
	}

}