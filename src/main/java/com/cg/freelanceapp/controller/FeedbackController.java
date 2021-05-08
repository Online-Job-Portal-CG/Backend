package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.FeedbackDTO;
import com.cg.freelanceapp.service.IFeedbackService;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {
	
	@Autowired
	IFeedbackService feedbackService;
	
	@PostMapping("/add")
	public ResponseEntity<Object> addFeedback(FeedbackDTO feedbackDto){
		feedbackService.createFeedback(feedbackDto);
		return new ResponseEntity<>("Feedback Added Successfully", HttpStatus.OK);
	}
	
	@GetMapping("/get/{freelancerId}")
	public ResponseEntity<Object> getFeedbackForFreelancer(@PathVariable Long freelancerId){
		
		return new ResponseEntity<>(feedbackService.findFeedbacksByFreelancer(freelancerId), HttpStatus.OK);
	}
}
