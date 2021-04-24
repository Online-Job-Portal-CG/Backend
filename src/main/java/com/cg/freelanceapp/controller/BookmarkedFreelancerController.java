package com.cg.freelanceapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.exceptions.BookmakedFreelancerValidationException;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedFreelancerException;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;
import com.google.gson.Gson;

/**
 * 
 * @author Vishnuvardhan 
 * Description: This class is used for bookmarking a freelancer by the recruiter. 
 * Created Date: 18 April, 2021 
 * Version : v1.0.0
 */
@RestController
@RequestMapping("/bmark/freelancer")
public class BookmarkedFreelancerController {

	@Autowired
	IBookmarkedFreelancerService bookmarkedFreelancerService;

	/**
	 * 
	 * @param        bookmarkedFreelancerDto
	 * @return       Response Entity of String type
	 * Description : This method creates a new Bookmark of a freelancer.
	 * @postmapping: <Write about what post mapping means here>
	 */
	@PostMapping("/add")
	public ResponseEntity<String> createBookmark(@Valid @RequestBody BookmarkedFreelancerDTO bookmarkedFreelancerDto,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new BookmakedFreelancerValidationException(errMessages);
		}
		try {
			bookmarkedFreelancerService.bookmarkFreelancer(bookmarkedFreelancerDto);
		} catch (InvalidBookmarkedFreelancerException exception) {
			throw new InvalidBookmarkedFreelancerException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getById(@Valid @PathVariable Long id) {
		try {
			BookmarkedFreelancer bookmark = bookmarkedFreelancerService.findById(id);
			return new ResponseEntity<>(bookmark, HttpStatus.OK);
		} catch(InvalidBookmarkedFreelancerException exception) {
			throw new InvalidBookmarkedFreelancerException("No Bookmark with specified id.");
		}
	}

	@GetMapping("/findBySkill/{skillName}")
	public List<BookmarkedFreelancer> listFreelancersBySkill(@Valid @PathVariable String skillName) {
		List<BookmarkedFreelancer> bookmarkedFreelancers = bookmarkedFreelancerService.findBookmarkedFreelancersBySkillName(skillName);
		JSONObject json = new JSONObject( new Gson().toJson(bookmarkedFreelancers));
		if(json.isEmpty()) {
			throw new InvalidBookmarkedFreelancerException("No bookmarks found for the specified skill name");
		}else {
			return bookmarkedFreelancers;
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		try {
			bookmarkedFreelancerService.deleteBookmarkedFreelancerById(id);
		}catch(InvalidBookmarkedFreelancerException exception) {
			throw new InvalidBookmarkedFreelancerException("No bookmark with specified id exists.");
		}
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}
}
