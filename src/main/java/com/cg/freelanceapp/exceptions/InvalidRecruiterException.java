package com.cg.freelanceapp.exceptions;

public class InvalidRecruiterException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1319886001655231121L;

	public InvalidRecruiterException() {
		super();
	}

	public InvalidRecruiterException(String msg) {
		super(msg);
	}
}
