package com.cg.freelanceapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

/**************************************************************************************
 * @author Amruth N 
 * Description: This is the rest controller class for SkillExperience module. 
 * Created Date: 22 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.SkillExperienceDTO;
import com.cg.freelanceapp.exceptions.InvalidSkillExperienceException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.ISkillExperienceService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/skillExperience")
@CrossOrigin(origins = "*")
public class SkillExperienceController {

	@Autowired
	ISkillExperienceService skillExperienceService;

	@ApiOperation(value = "Add skill")
	@PostMapping("/add")
	public ResponseEntity<Object> addSkillExperience(@Valid @RequestBody SkillExperienceDTO skillexperienceDto,
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
			skillExperienceService.addSkill(skillexperienceDto);
		} catch (InvalidSkillExperienceException exception) {
			throw new InvalidSkillExperienceException("One or more fields contains invalid entries.");
		}
		return new ResponseEntity<>("Skill Saved.", HttpStatus.OK);
	}

	@GetMapping("/getAll/id/{id}")
	public ResponseEntity<Object> getSkillExperience(@PathVariable Long id) {
		try {
			skillExperienceService.getSkillById(id);
			return new ResponseEntity<>(skillExperienceService.getSkillById(id), HttpStatus.OK);
		} catch (InvalidSkillExperienceException e) {
			throw new InvalidSkillExperienceException("Cannot find skillExperience with given id");
		}
	}

	@PutMapping("/update/freelancer/{freelancerId}/skill/{id}")
	public ResponseEntity<Object> updateSkillYears(@PathVariable Long id, @PathVariable Long freelancerId,
			@RequestParam(value = "years") Integer years) {
		System.out.println(years);
		try {
			skillExperienceService.updateSkillYears(id, freelancerId, years);
			String response = "Updated records successfully";
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (InvalidSkillExperienceException e) {
			throw new InvalidSkillExperienceException("Cannot find skillExperience with given id");
		}
	}

	@GetMapping("/getAll/freelancer/{id}")
	public ResponseEntity<Object> listByFreelancer(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(skillExperienceService.getSkillByFreelancerId(id), HttpStatus.OK);
		} catch (InvalidSkillExperienceException e) {
			throw new InvalidSkillExperienceException("Freelancer with given id not found");
		}
	}

	@GetMapping("/get/freelancer/{id}")
	public ResponseEntity<Object> getByFreelancer(@PathVariable Long id) {
		try {
			return new ResponseEntity<>(skillExperienceService.getByFreelancer(id),HttpStatus.OK);
		}catch(InvalidSkillExperienceException e) {
			throw new InvalidSkillExperienceException("Freelancer with given id not found");
		}
	}
}