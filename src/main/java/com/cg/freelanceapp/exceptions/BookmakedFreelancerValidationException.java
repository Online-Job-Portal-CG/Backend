package com.cg.freelanceapp.exceptions;

import java.util.ArrayList;
import java.util.List;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : Bookmarked Freelancer Validation class. 
 * Created Date: 22 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class BookmakedFreelancerValidationException extends RuntimeException {

	private static final long serialVersionUID = -5970913799468930325L;
	List<String> messages = new ArrayList<>();

	public BookmakedFreelancerValidationException() {
		super();
	}

	public BookmakedFreelancerValidationException(List<String> messages) {
		super();
		this.messages = messages;
	}

	public List<String> getMessages() {
		return messages;
	}

}
