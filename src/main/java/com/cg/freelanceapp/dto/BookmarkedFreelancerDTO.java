package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the DTO class for BookmarkedFreelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
public class BookmarkedFreelancerDTO {
	
	@NotNull(message = "skillId cant be null")
	private Long skillId;
	@NotNull(message = "recruiterId cant be null")
	private Long recruiterId;
	@NotNull(message = "freelancerId cant be null")
	private Long freelancerId;

	public BookmarkedFreelancerDTO() {
		super();
	}

	public BookmarkedFreelancerDTO(Long skillId, Long recruiterId, Long freelancerId) {
		super();
		this.skillId = skillId;
		this.recruiterId = recruiterId;
		this.freelancerId = freelancerId;
	}

	public Long getFreelancerId() {
		return freelancerId;
	}

	public Long getRecruiterId() {
		return recruiterId;
	}

	public Long getSkillId() {
		return skillId;
	}

	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}

	public void setRecruiterId(Long recruiterId) {
		this.recruiterId = recruiterId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

}
