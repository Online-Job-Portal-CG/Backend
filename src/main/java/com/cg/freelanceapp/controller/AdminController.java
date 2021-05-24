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

import com.cg.freelanceapp.dto.AdminDTO;
import com.cg.freelanceapp.entities.Admin;
import com.cg.freelanceapp.exceptions.InvalidAdminException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.IAdminService;

/**
 * 
 * @author    Akash Sunil Kumar
 * Description: This class is used as the controller for the Admin module 
 * Created Date: 18 April, 2021 
 * Version : v1.0.0
 */
@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

	@Autowired
	IAdminService adminService;

	/**
	 * 
	 * @param        admin
	 * @return       Response Entity of Object type
	 * Description : This method creates a new entry for an admin.
	 * @PostMapping: maps HTTP POST requests onto specific handler methods.
	 * 
	 */

	@PostMapping("/save")
	public ResponseEntity<Object> adminSave(@Valid @RequestBody AdminDTO adminDto, BindingResult bindingResult) {
		System.out.println(adminDto.toString());
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
			adminService.save(adminDto);
			return new ResponseEntity<>("Admin Successfully", HttpStatus.ACCEPTED);
		} catch (InvalidAdminException exception) {
			throw new InvalidAdminException("Could not save new Admin");
		}

	}

	/**
	 * 
	 * @param        id,admin
	 * @return       Response Entity of Object type
	 * Description : This method Updates the entry in Admin.
	 * @PutMapping: Handles HTTP Put Requests
	 * 
	 */

	@PutMapping("/update/{id}")
	public ResponseEntity<Object> adminUpdate(@PathVariable Long id, @RequestBody AdminDTO adminDto) {

		try {
			adminService.update(id, adminDto);
			return new ResponseEntity<>("Admin Successfully", HttpStatus.ACCEPTED);

		} catch (InvalidAdminException exception) {
			throw new InvalidAdminException("Admin with given id not found");
		}
	}

	/**
	 * 
	 * @param        id
	 * @return       Response Entity of type Admin
	 * Description : This method finds Admin by id
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 
	 */

	@GetMapping(value = "/find/id/{id}")
	public Admin findById(@PathVariable Long id) {
		try {
			return adminService.findById(id);
		} catch (InvalidAdminException exception) {
			throw new InvalidAdminException("Id not found");
		}
	}

	/**
	 * 
	 * @param        userName
	 * @return       Response Entity of type Admin
	 * Description: This method finds Admin by userName
	 * @GetMapping: Annotation for mapping HTTP GET requests onto specific handler methods.
	 * 
	 */

	@GetMapping(value = "/find/name/{userName}")
	public Admin findByUserName(@PathVariable String userName) {
		try {
			return adminService.findByUserName(userName);
		} catch (InvalidAdminException exception) {
			throw new InvalidAdminException("Admin with userName not found");
		}
	}
}