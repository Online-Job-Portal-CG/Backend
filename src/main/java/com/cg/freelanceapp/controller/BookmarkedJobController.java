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

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.exceptions.InvalidBookmarkedJobException;
import com.cg.freelanceapp.exceptions.JobPortalValidationException;
import com.cg.freelanceapp.service.IBookmarkedJobService;

@RestController
@RequestMapping("/bmark/job")
@CrossOrigin(origins = "*")
public class BookmarkedJobController {
	@Autowired
	IBookmarkedJobService bookmarkedJobService;

	/**
	 * 
	 * Method     : createBookmark
	 * @param       bookmarkedjobdto
	 * @throws      BookmarkedJobValidationException
	 * @return      ResponseEntity
	 * Description: This method request for the data, checks validation of the data and creates bookmark for job.
	 * @PostMapping: This annotation handles with http post requests matched with the given url expression.  
	 */
	@PostMapping("/add")
	public ResponseEntity<Object> createBookmark(@Valid @RequestBody BookmarkedJobDTO bookmarkedjobdto,
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
			bookmarkedJobService.bookmarkJob(bookmarkedjobdto);
		} catch (InvalidBookmarkedJobException exception) {
			throw new InvalidBookmarkedJobException("One or more entered fields contain invalid objects.");
		}
		return new ResponseEntity<>("Added successfully", HttpStatus.OK);

	}

	/**
	 * 
	 * Method     : deleteById
	 * @param       id
	 * @throws      InvalidBookmarkedJobException
	 * @return      ResponseEntity
	 * Description: returns the status.
	 * @DeleteMapping: This annotation handles with http delete requests matched with the given url expression.  
	 */

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		try {
			bookmarkedJobService.remove(id);
		} catch (InvalidBookmarkedJobException exception) {
			throw new InvalidBookmarkedJobException("No bookmark with specified id exists.");
		}
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}

	/**
	 * 
	 * Method     : getById
	 * @param       id
	 * @throws      InvalidBookmarkedJobException
	 * @return      ResponseEntity
	 * Description: returns the status.
	 * GetMapping: This annotation handles with http get requests matched with the given url expression.  
	 */

	@GetMapping("/get/id/{id}")
	public ResponseEntity<Object> getById(@Valid @PathVariable Long id) {
		try {
			BookmarkedJob bookmarkedJob = bookmarkedJobService.findById(id);
			return new ResponseEntity<>(bookmarkedJob, HttpStatus.OK);
		} catch (InvalidBookmarkedJobException exception) {
			throw new InvalidBookmarkedJobException("No Bookmark with specified id.");
		}
	}

	/**
	 * 
	 * Method     : getBySkill
	 * @param       id
	 * @throws      InvalidBookmarkedJobException
	 * @return      ResponseEntity
	 * Description: returns the status.
	 * @GettMapping: This annotation handles with http get requests matched with the given url expression.  
	 */

	@GetMapping("/get/skill/{skillName}")
	public List<BookmarkedJob> listJobsBySkill(@Valid @PathVariable String skillName) {
		try {
			List<BookmarkedJob> bookmarkedJobs = bookmarkedJobService.findBookmarkedJobsBySkillName(skillName);
			return bookmarkedJobs;
		} catch (InvalidBookmarkedJobException exception) {
			throw new InvalidBookmarkedJobException("No bookmarks found for the specified skill name");
		}
	}

	@GetMapping("findAll/{frId}")
	public ResponseEntity<Object> findAll(@PathVariable Long frId) {
		System.out.println(frId);
		return new ResponseEntity<>(bookmarkedJobService.findAllBookmarks(frId), HttpStatus.OK);
	}

}
