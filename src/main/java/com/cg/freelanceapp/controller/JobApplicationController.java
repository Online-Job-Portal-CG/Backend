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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.JobApplicationDTO;
import com.cg.freelanceapp.dto.JobApplicationsListDTO;
import com.cg.freelanceapp.entities.JobApplication;
import com.cg.freelanceapp.exceptions.InvalidJobApplicationException;
import com.cg.freelanceapp.exceptions.InvalidJobException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.IJobApplicationService;

import io.swagger.annotations.ApiOperation;

/**************************************************************************************
 * @author Siddhesh
 * Description: This is the rest controller class for JobApplication module. 
 * Created Date: 26 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/

@RestController
@RequestMapping(value = "/jobApplication")
@CrossOrigin(origins = "*")
public class JobApplicationController {

	@Autowired
	IJobApplicationService jobApplicationService;

	/*****************************************************************************************
	 * Method      : applyToJob      
	 * @param        jobApplicationDto
	 * @throws       The method throws different exceptions based on improperly entered fields
	 * @return       Response Entity of Object type
	 * Description : This method creates a new Job Application
	 * @postmapping: Post mapping requests a body from the user
	 * 				 which is then persisted onto the database.
	 ****************************************************************************************/

	@ApiOperation(value = "apply to job application")
	@PostMapping(value = "/apply")
	public ResponseEntity<String> applyToJob(@Valid @RequestBody JobApplicationDTO jobApplicationDto,
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
			jobApplicationService.applyToJob(jobApplicationDto);
		} catch (InvalidJobException e) {
			throw new InvalidJobException("Job not found With given Id");
		} catch (InvalidJobApplicationException exception) {
			throw new InvalidJobApplicationException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Job Applied Successfully", HttpStatus.CREATED);
	}

	/************************************************************************************
	 * Method      : findById       
	 * @param        Id
	 * @throws       InvalidJobApplicationException
	 * @return       JobApplication Object
	 * Description : This method fetches a Job Application based on the unique id
	 * @getmapping : Get mapping expects a PathVariable to be passed 
	 *               which is then used to return the entity object 
	 *               that is fetched from the database.
	 ************************************************************************************/

	@GetMapping(value = "/findAll")
	public ResponseEntity<Object> findAll() {
		try {
			return new ResponseEntity<>(jobApplicationService.findAll(), HttpStatus.OK);
		} catch (InvalidJobApplicationException e) {
			throw new InvalidJobApplicationException("Job Application Id Not Found");
		}
	}

	/*************************************************************************************
	 * Method        : deleteById       
	 * @param          id
	 * @throws         InvalidJobApplicationException
	 * @return         Response Entity of Object type
	 * Description   : This method deletes a Job Application by id 
	 * @deletemapping: Delete mapping expects a PathVariable to be passed 
	 *                 which is used to delete the object from the database.
	 ************************************************************************************/

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Object> remove(@Valid @PathVariable Long id) {
		try {
			jobApplicationService.remove(id);
			return new ResponseEntity<>("job application deleted successfully", HttpStatus.OK);
		} catch (InvalidJobApplicationException e) {
			throw new InvalidJobApplicationException("Invalid Job Application Id");
		}
	}

	/*****************************************************************************************
	 * Method      : updateJobApplication     
	 * @param        jobApplicationDto
	 * @throws       InvalidJobApplicationException
	 * @return       Response Entity of Object type
	 * Description : This method updates the existing Job Application
	 * @putmapping: Put mapping requests a body from the user
	 * 				 which is then persisted onto the database.
	 ****************************************************************************************/

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Object> updateJobApplication(@Valid @PathVariable Long id,
			@RequestBody JobApplicationDTO jobApplicationDto, BindingResult bindingResult) {
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
			jobApplicationService.updateJobApplication(id, jobApplicationDto);
			return new ResponseEntity<>("job application updated successfully", HttpStatus.OK);
		} catch (InvalidJobApplicationException e) {
			throw new InvalidJobApplicationException("Invalid Job Application Id");
		}
	}

	@GetMapping(value = "/findAll/job/{jobId}")
	public ResponseEntity<Object> findAllApplications(@PathVariable Long jobId) {
		try {
			return new ResponseEntity<>(jobApplicationService.findAllByJobId(jobId), HttpStatus.OK);
		} catch (InvalidJobApplicationException e) {
			throw new InvalidJobApplicationException("Job with given Id not found");
		}
	}

	@GetMapping(value = "/findByFrId/job/{jobId}/frId/{frId}")
	public ResponseEntity<Object> findByFrId(@PathVariable Long jobId, @PathVariable Long frId) {
		return new ResponseEntity<>(jobApplicationService.findByFreelancerId(jobId, frId), HttpStatus.OK);
	}

}