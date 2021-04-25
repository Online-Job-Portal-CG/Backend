package com.cg.freelanceapp.exceptions;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : Invalid Freelancer Exception class. 
 * Created Date: 18 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class InvalidFreelancerException extends RuntimeException {

	private static final long serialVersionUID = -5601025445317923191L;

	public InvalidFreelancerException() {
		super();
	}

	public InvalidFreelancerException(String msg) {
		super(msg);
	}
}
