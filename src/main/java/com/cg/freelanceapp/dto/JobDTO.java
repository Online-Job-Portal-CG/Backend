package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

public class JobDTO {
	private long freelancerid = 2L;
	@NotNull(message = "skillId cant be null")
	private long skillId;
	@NotNull(message = "recruiterid cant be null")
	private long recruiterId;

	private String jobTitle;
	private String jobDescription;

	public JobDTO() {
		super();
	}

	public JobDTO(long freelancerid, long skillId, long recruiterId, String jobTitle, String jobDescription) {
		super();
		this.freelancerid = freelancerid;
		this.skillId = skillId;
		this.recruiterId = recruiterId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
	}

	public long getFreelancerid() {
		return freelancerid;
	}

	public long getRecruiterId() {
		return recruiterId;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setFreelancerid(long freelancerid) {
		this.freelancerid = 2L;
	}

	public void setRecruiterId(long recruiterId) {
		this.recruiterId = recruiterId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "JobDTO [freelancerid=" + freelancerid + ", skillId=" + skillId + ", recruiterId=" + recruiterId
				+ ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + "]";
	}

}