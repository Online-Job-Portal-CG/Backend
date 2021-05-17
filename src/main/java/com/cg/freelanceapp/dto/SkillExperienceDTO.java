package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

/**************************************************************************************
 * @author       Amruth N
 * Description : This is the DTO class for SkillExperience module. 
 * Created Date: 22 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class SkillExperienceDTO {
	@NotNull(message = "Experience cannot be empty")
	private Integer years;
	@NotNull(message = "Skill Id cannot be blank")
	private Long skillId;
	@NotNull(message = "Freelancer Id cannot be blank")
	private Long freelancerId;

	public SkillExperienceDTO() {
		super();
	}

	public SkillExperienceDTO(Integer years, Long skillId, Long freelancerId) {
		super();
		this.years = years;
		this.skillId = skillId;
		this.freelancerId = freelancerId;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public Integer getYears() {
		return years;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

}