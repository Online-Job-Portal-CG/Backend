package com.cg.freelanceapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

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
	 * @param bookmarkedFreelancerDto
	 * @return Response Entity of String type
	 * Description :
	 * @postmapping: <Write about what post mapping means here>
	 */
	@PostMapping("/add")
	public ResponseEntity<String> createBookmark(@RequestBody BookmarkedFreelancerDTO bookmarkedFreelancerDto) {
		bookmarkedFreelancerService.bookmarkFreelancer(bookmarkedFreelancerDto);
		return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id) {
		BookmarkedFreelancer bookmark = bookmarkedFreelancerService.findById(id);
		return new ResponseEntity<>(bookmark, HttpStatus.OK);
	}

	@GetMapping("/findBySkill/{skillName}")
	public List<BookmarkedFreelancer> listFreelancersBySkill(@PathVariable String skillName) {
		return bookmarkedFreelancerService.findBookmarkedFreelancersBySkillName(skillName);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		bookmarkedFreelancerService.deleteBookmarkedFreelancerById(id);
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}
}
