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
	Integer years;
	@NotNull(message = "Skill Id cannot be blank")
	Long skillId;
	@NotNull(message = "Freelancer Id cannot be blank")
	Long freelancerId;

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
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

	public SkillExperienceDTO(Integer years, Long skillId, Long freelancerId) {
		super();
		this.years = years;
		this.skillId = skillId;
		this.freelancerId = freelancerId;
	}

	public SkillExperienceDTO() {
		super();
	}

}