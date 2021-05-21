package com.cg.freelanceapp.dto;

public class BookmarkedJobListDTO {
	private Long id;
	private Long skillId;
	private String skillName;
	private Long freelancerId;
	private String freelancerName;
	private Long jobId;
	private String jobName;

	public BookmarkedJobListDTO(Long id, Long skillId, String skillName, Long freelancerId, String freelancerName,
			Long jobId, String jobName) {
		super();
		this.id = id;
		this.skillId = skillId;
		this.skillName = skillName;
		this.freelancerId = freelancerId;
		this.freelancerName = freelancerName;
		this.jobId = jobId;
		this.jobName = jobName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public String getFreelancerName() {
		return freelancerName;
	}

	public void setFreelancerName(String freelancerName) {
		this.freelancerName = freelancerName;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

}
