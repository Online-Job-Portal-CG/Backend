package com.cg.freelanceapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JobPortalController {

	@ExceptionHandler(value = InvalidBookmarkedFreelancerException.class)
	public ResponseEntity<Object> handleException(InvalidBookmarkedFreelancerException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidFreelancerException.class)
	public ResponseEntity<Object> handleException(InvalidFreelancerException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidRecruiterException.class)
	public ResponseEntity<Object> handleException(InvalidRecruiterException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
}
