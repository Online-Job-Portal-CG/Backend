package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

/**
 * 
 * @author      Vishnuvardhan Reddy
 * Description: This is the DTO class for BookmarkedJob module
 *
 */
public class BookmarkedJobDTO {
	@NotNull(message = "Skill id cannot be empty")
	private Long skillId;
	@NotNull(message = "job id cannot be empty")
	private Long jobId;
	@NotNull(message = "freelancer id cannot be empty")
	private Long freelancerId;

	public BookmarkedJobDTO() {
		super();
	}

	public BookmarkedJobDTO(Long skillId, Long jobId, Long freelancerId) {
		super();
		this.skillId = skillId;
		this.jobId = jobId;
		this.freelancerId = freelancerId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

}
