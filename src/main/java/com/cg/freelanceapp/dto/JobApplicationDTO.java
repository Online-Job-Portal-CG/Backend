package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class JobApplicationDTO {
	@NotNull(message = "Job ID cannot be blank")
	private Long jobId;
	@NotEmpty(message = "Cover Letter cannot be empty")
	private String coverLetter;

	public JobApplicationDTO() {
		super();
	}

	public JobApplicationDTO(Long jobId, String coverLetter) {
		super();
		this.jobId = jobId;
		this.coverLetter = coverLetter;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

}
