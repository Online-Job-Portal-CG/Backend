package com.cg.freelanceapp.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class JobApplicationDTO {
	@NotNull(message = "Job ID cannot be blank")
	private Long jobId;
	@NotNull(message = "Enter a valid date")
	private LocalDate appliedDate;
	@NotEmpty(message = "Cover Letter cannot be empty")
	private String coverLetter;

	public JobApplicationDTO() {
		super();
	}

	public JobApplicationDTO(Long jobId, LocalDate appliedDate, String coverLetter) {
		super();
		this.jobId = jobId;
		this.appliedDate = appliedDate;
		this.coverLetter = coverLetter;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public LocalDate getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDate appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

}
