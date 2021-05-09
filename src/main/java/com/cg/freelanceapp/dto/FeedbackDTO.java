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
	Long recruiterId;
	Long freelancerId;

	public FeedbackDTO() {
		super();
	}

	public FeedbackDTO(Integer ranges, String comments, Long recruiterId, Long freelancerId) {
		super();
		this.ranges = ranges;
		this.comments = comments;
		this.recruiterId = recruiterId;
		this.freelancerId = freelancerId;
	}

	public String getComments() {
		return comments;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public Integer getRanges() {
		return ranges;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public void setRanges(Integer ranges) {
		this.ranges = ranges;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

}
