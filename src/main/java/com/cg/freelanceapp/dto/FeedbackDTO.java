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
	private String recruiterUName;
	private String freelancerUName;

	public FeedbackDTO() {
		super();
	}

	public FeedbackDTO(Integer ranges, String comments, String recruiterUName, String freelancerUName) {
		super();
		this.ranges = ranges;
		this.comments = comments;
		this.recruiterUName = recruiterUName;
		this.freelancerUName = freelancerUName;
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

	public String getRecruiterUName() {
		return recruiterUName;
	}

	public void setRecruiterUName(String recruiterUName) {
		this.recruiterUName = recruiterUName;
	}

	public String getFreelancerUName() {
		return freelancerUName;
	}

	public void setFreelancerUName(String freelancerUName) {
		this.freelancerUName = freelancerUName;
	}

	@Override
	public String toString() {
		return "FeedbackDTO [ranges=" + ranges + ", comments=" + comments + ", recruiterUName=" + recruiterUName
				+ ", freelancerUName=" + freelancerUName + "]";
	}
	

}
