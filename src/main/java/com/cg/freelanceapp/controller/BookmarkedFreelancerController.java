package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.BookmarkedFreelancerDTO;
import com.cg.freelanceapp.entities.BookmarkedFreelancer;
import com.cg.freelanceapp.service.IBookmarkedFreelancerService;

@RestController
@RequestMapping("/bmark/freelancer")
public class BookmarkedFreelancerController {

	@Autowired
	IBookmarkedFreelancerService bookmarkedFreelancerService;

	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody BookmarkedFreelancerDTO bookmarkedFreelancerDto) {
		bookmarkedFreelancerService.bookmarkFreelancer(bookmarkedFreelancerDto);
		return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> get(@PathVariable Long id) {
		BookmarkedFreelancer fr = bookmarkedFreelancerService.findById(id);
		return new ResponseEntity<>(fr, HttpStatus.OK);
	}
}
