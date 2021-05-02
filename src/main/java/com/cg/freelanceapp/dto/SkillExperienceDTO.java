package com.cg.freelanceapp.dto;

public class SkillExperienceDTO {
	private Long skillId;
	private Integer years;
	private Long freelancerId;

	public SkillExperienceDTO() {
		super();
	}

	public SkillExperienceDTO(Long skillId, Integer years, Long freelancerId) {
		super();
		this.skillId = skillId;
		this.years = years;
		this.freelancerId = freelancerId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

}
