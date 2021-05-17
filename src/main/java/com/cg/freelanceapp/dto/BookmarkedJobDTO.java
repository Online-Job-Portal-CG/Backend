package com.cg.freelanceapp.dto;
import javax.validation.constraints.NotNull;


public class BookmarkedJobDTO 
{
	@NotNull(message="Skill_id cannot be null")
	private Long skillId;
	
	@NotNull(message="freelancer_id cannot be null")
	private Long freelancerId;
	
	@NotNull(message="job_id cannot be null")
    private Long jobId;

	public BookmarkedJobDTO() {
		super();
	}
	public BookmarkedJobDTO(Long skillId, Long freelancerId, Long jobId) {
		super();
		this.skillId = skillId;
		this.freelancerId = freelancerId;
		this.jobId = jobId;
	}
	public Long getFreelancerId() {
		return freelancerId;
	}
	public Long getJobId() {
		return jobId;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	
	

}
