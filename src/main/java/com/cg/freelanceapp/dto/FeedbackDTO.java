package com.cg.freelanceapp.dto;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the DTO class for Feedback module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class FeedbackDTO {
	private Integer ranges;
	private String comments;
	private String recruiterId;
	private String freelancerId;

	public FeedbackDTO() {
		super();
	}

	public FeedbackDTO(Integer ranges, String comments, String recruiterId, String freelancerId) {
		super();
		this.ranges = ranges;
		this.comments = comments;
		this.recruiterId = recruiterId;
		this.freelancerId = freelancerId;
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

	public String getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(String recruiterId) {
		this.recruiterId = recruiterId;
	}

	public String getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(String freelancerId) {
		this.freelancerId = freelancerId;
	}

}
