package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.JobDTO;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.service.IJobService;

/**
 * 
 * @author   Akash Sunil Kumar
 * Description: This class is the controller for the job module 
 * Created Date: 18 April, 2021 
 * Version : v1.0.0
 */

@RestController
@RequestMapping("/job")
@CrossOrigin(origins = "*")
public class JobController {

	@Autowired
	IJobService jobService;

	/**
	 * 
	 * @param        job
	 * @return       Response Entity of String type
	 * Description : This method closes the job module.
	 * @PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
	 * 
	 */

	@DeleteMapping("/close/{id}")
	public ResponseEntity<Object> close(@PathVariable Long id) {
		try {
			jobService.close(id);
		} catch (InvalidJobException exception) {
			throw new InvalidJobException("Job with given id not found");
		}
		return new ResponseEntity<>("closed successfully", HttpStatus.OK);

	}

	/**
	 * 
	 * @param        id
	 * @return       Response Entity of Job type
	 * Description : This method finds a job by id
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 
	 */

	@GetMapping(value = "/findById/{id}")
	public ResponseEntity<Object> findById(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(jobService.findById(id), HttpStatus.OK);
		} catch (InvalidJobException exception) {
			throw new InvalidJobException("Job with given id doesn't exist");
		}

	}

	/**
	 * 
	 * @param        name
	 * @return       Response Entity of Object type
	 * Description : This method finds a job by Skill
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 
	 */

	@GetMapping(value = "/findJobsBySkill/{name}")
	public ResponseEntity<Object> findbyskill(@PathVariable String name) {
		try {
			jobService.findJobsBySkillName(name);
			return new ResponseEntity<>("Found Succesfully", HttpStatus.ACCEPTED);
		} catch (InvalidJobException exception) {
			throw new InvalidJobException("no job with this skill found");
		}

	}

	/**
	 * 
	 * @param        jobDto
	 * @return       Response Entity of Object type
	 * Description : This method posts a new job.
	 * @PostMapping: Annotation for mapping HTTP POST requests onto specific handler methods.
	 * 
	 */

	@PostMapping("/postJob")
	public ResponseEntity<Object> job(@RequestBody JobDTO jobDto) {

		jobService.postJob(jobDto);
		return new ResponseEntity<>("Job Posted Successfully", HttpStatus.ACCEPTED);
	}

}
