package com.cg.freelanceapp.dto;

public class JobListDTO {

	private Long jobId;
	private Long freelancerId;
	private String freelancerName;
	private Long skillId;
	private String skillName;
	private Long recruiterId;
	private String recruiterName;
	private String jobTitle;
	private String jobDescription;
	private boolean jobStatus;

	
	public JobListDTO(Long jobId, Long freelancerId, String freelancerName, Long skillId, String skillName,
			Long recruiterId, String recruiterName, String jobTitle, String jobDescription, boolean jobStatus) {
		super();
		this.jobId = jobId;
		this.freelancerId = freelancerId;
		this.freelancerName = freelancerName;
		this.skillId = skillId;
		this.skillName = skillName;
		this.recruiterId = recruiterId;
		this.recruiterName = recruiterName;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobStatus = jobStatus;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getFreelancerName() {
		return freelancerName;
	}

	public void setFreelancerName(String freelancerName) {
		this.freelancerName = freelancerName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
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

	public boolean isJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(boolean jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}
	
	

}
