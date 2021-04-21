package com.cg.freelanceapp.exceptions;

public class InvalidRecruiterException extends RuntimeException {
	public InvalidRecruiterException() {
		super();
	}

	public InvalidRecruiterException(String msg) {
		super(msg);
	}
}
