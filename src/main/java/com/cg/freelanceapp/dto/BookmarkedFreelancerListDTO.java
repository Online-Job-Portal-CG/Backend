package com.cg.freelanceapp.dto;

public class BookmarkedFreelancerListDTO {
	private Long id;
	private String freelancerName;
	private String freelancerUName;
	private String recruiterName;
	private String recruiterUName;

	public BookmarkedFreelancerListDTO(Long id, String freelancerName, String freelancerUName, String recruiterName,
			String recruiterUName) {
		super();
		this.id = id;
		this.freelancerName = freelancerName;
		this.freelancerUName = freelancerUName;
		this.recruiterName = recruiterName;
		this.recruiterUName = recruiterUName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFreelancerName() {
		return freelancerName;
	}

	public void setFreelancerName(String freelancerName) {
		this.freelancerName = freelancerName;
	}

	public String getFreelancerUName() {
		return freelancerUName;
	}

	public void setFreelancerUName(String freelancerUName) {
		this.freelancerUName = freelancerUName;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public String getRecruiterUName() {
		return recruiterUName;
	}

	public void setRecruiterUName(String recruiterUName) {
		this.recruiterUName = recruiterUName;
	}

}
