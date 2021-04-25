package com.cg.freelanceapp.dto;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the DTO class for Feedback module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class FeedbackDTO {
	Integer ranges;
	String comments;

	public FeedbackDTO() {
		super();
	}

	public FeedbackDTO(Integer ranges, String comments) {
		super();
		this.ranges = ranges;
		this.comments = comments;
	}

	public Integer getRanges() {
		return ranges;
	}

	public void setRanges(Integer ranges) {
		this.ranges = ranges;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
