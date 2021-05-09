package com.cg.freelanceapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Controller advice for the whole project. 
 * 				 It tells the rest controllers to process different 
 * 				 exceptions and parse the output accordingly. 
 * Created Date: 22 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@RestControllerAdvice
public class JobPortalExceptionController {

	@ExceptionHandler(value = DuplicateSkillException.class)
	public ResponseEntity<Object> handleException(DuplicateSkillException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler(value = InvalidAdminException.class)
	public ResponseEntity<Object> handleException(InvalidAdminException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidBookmarkedFreelancerException.class)
	public ResponseEntity<Object> handleException(InvalidBookmarkedFreelancerException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidBookmarkedJobException.class)
	public ResponseEntity<Object> handleException(InvalidBookmarkedJobException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidFeedbackException.class)
	public ResponseEntity<Object> handleException(InvalidFeedbackException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidFreelancerException.class)
	public ResponseEntity<Object> handleException(InvalidFreelancerException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidJobApplicationException.class)
	public ResponseEntity<Object> handleException(InvalidJobApplicationException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidJobException.class)
	public ResponseEntity<Object> handleException(InvalidJobException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidRecruiterException.class)
	public ResponseEntity<Object> handleException(InvalidRecruiterException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidSkillException.class)
	public ResponseEntity<Object> handleException(InvalidSkillException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = InvalidSkillExperienceException.class)
	public ResponseEntity<Object> handleException(InvalidSkillExperienceException exception) {
		return new ResponseEntity<>(exception.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = JobPortalValidationException.class)
	public ResponseEntity<Object> handleException(JobPortalValidationException exception) {
		return new ResponseEntity<>(exception.getMessages(), HttpStatus.BAD_REQUEST);
	}
}
