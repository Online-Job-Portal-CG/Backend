package com.cg.freelanceapp.exceptions;

public class InvalidFeedbackException extends RuntimeException {
	private static final long serialVersionUID = 45059082327295909L;

	public InvalidFeedbackException() {
		super();
	}

	public InvalidFeedbackException(String message) {
		super(message);
	}

}
