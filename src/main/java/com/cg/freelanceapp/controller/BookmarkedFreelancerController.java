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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedFreelancerException;
import com.cg.freelanceapp.exceptions.InvalidFreelancerException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

/**************************************************************************************
 * @author Vishnuvardhan 
 * Description: This is the rest controller class for BookmarkedFreelancer module. 
 * Created Date: 20 April, 2021 
 * Version : v1.0.0
 *************************************************************************************/
@RestController
@RequestMapping("/bmark/freelancer")
@CrossOrigin(origins = "*")
public class BookmarkedFreelancerController {

	@Autowired
	IBookmarkedFreelancerService bookmarkedFreelancerService;

	/*****************************************************************************************
	 * Method      : createBookmark       
	 * @param        bookmarkedFreelancerDto
	 * @throws       The method throws different exceptions based on improperly entered fields
	 * @return       Response Entity of Object type
	 * Description : This method creates a new Bookmark of a freelancer.
	 * @postmapping: Post mapping requests a body from the user
	 * 				 which is then persisted onto the database.
	 ****************************************************************************************/
	@PostMapping("/add")
	public ResponseEntity<Object> createBookmark(@Valid @RequestBody BookmarkedFreelancerDTO bookmarkedFreelancerDto,
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
			bookmarkedFreelancerService.bookmarkFreelancer(bookmarkedFreelancerDto);
		} catch (InvalidBookmarkedFreelancerException exception) {
			throw new InvalidBookmarkedFreelancerException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);
	}

	/*************************************************************************************
	 * Method        : deleteById       
	 * @param          id
	 * @throws         InvalidBookmarkedFreelancerException
	 * @return         Response Entity of Object type
	 * Description   : This method deletes a bookmark by id 
	 * @deletemapping: Delete mapping expects a PathVariable to be passed 
	 *                 which is used to delete the object from the database.
	 ************************************************************************************/
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		try {
			bookmarkedFreelancerService.deleteBookmarkedFreelancerById(id);
		} catch (InvalidBookmarkedFreelancerException exception) {
			throw new InvalidBookmarkedFreelancerException("No bookmark with specified id exists.");
		}
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}

	/************************************************************************************
	 * Method      : getById       
	 * @param        Id
	 * @return       Response Entity of Object type
	 * Description : This method fetches a Bookmarked Freelancer based on the unique id
	 * @getmapping : Get mapping expects a PathVariable to be passed 
	 *               which is then used to return the entity object 
	 *               that is fetched from the database.
	 ************************************************************************************/
	@GetMapping("/get/id/{id}")
	public ResponseEntity<Object> getById(@Valid @PathVariable Long id) {
		try {
			BookmarkedFreelancer bookmark = bookmarkedFreelancerService.findById(id);
			return new ResponseEntity<>(bookmark, HttpStatus.OK);
		} catch (InvalidBookmarkedFreelancerException exception) {
			throw new InvalidBookmarkedFreelancerException("No Bookmark with specified id.");
		}
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<Object> getAll(){
		return new ResponseEntity<>(bookmarkedFreelancerService.getAll(), HttpStatus.OK);
	}
}
