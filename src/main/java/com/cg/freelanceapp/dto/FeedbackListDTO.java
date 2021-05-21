package com.cg.freelanceapp.dto;

public class FeedbackListDTO {
	private Long id;
	private Long frId;
	private String freelancerName;
	private String frUName;
	private Long recId;
	private String recruiterName;
	private String recUName;
	private Integer rating;
	private String comments;
	public FeedbackListDTO(Long id, Long frId, String freelancerName, String frUName, Long recId, String recruiterName,
			String recUName, Integer rating, String comments) {
		super();
		this.id = id;
		this.frId = frId;
		this.freelancerName = freelancerName;
		this.frUName = frUName;
		this.recId = recId;
		this.recruiterName = recruiterName;
		this.recUName = recUName;
		this.rating = rating;
		this.comments = comments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFrId() {
		return frId;
	}
	public void setFrId(Long frId) {
		this.frId = frId;
	}
	public String getFreelancerName() {
		return freelancerName;
	}
	public void setFreelancerName(String freelancerName) {
		this.freelancerName = freelancerName;
	}
	public String getFrUName() {
		return frUName;
	}
	public void setFrUName(String frUName) {
		this.frUName = frUName;
	}
	public Long getRecId() {
		return recId;
	}
	public void setRecId(Long recId) {
		this.recId = recId;
	}
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getRecUName() {
		return recUName;
	}
	public void setRecUName(String recUName) {
		this.recUName = recUName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
