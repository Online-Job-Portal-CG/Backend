package com.cg.freelanceapp.dto;

public class BookmarkedFreelancerDTO {
	Long skillId;
	Long recruiterId;
	Long freelancerId;

	public BookmarkedFreelancerDTO() {
		super();
	}

	public BookmarkedFreelancerDTO(Long skillId, Long recruiterId, Long freelancerId) {
		super();
		this.skillId = skillId;
		this.recruiterId = recruiterId;
		this.freelancerId = freelancerId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

}
