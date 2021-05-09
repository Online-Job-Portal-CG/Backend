package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotNull;

public class JobDTO {
	@NotNull(message = "freelancerid cant be null")
	private long freelancerid;
	@NotNull(message = "skillId cant be null")
	private long skillId;
	@NotNull(message = "recruiterid cant be null")
	private long recruiterId;

	public JobDTO() {
		super();
	}

	public JobDTO(long freelancerid, long skillId, long recruiterId) {
		super();
		this.freelancerid = freelancerid;
		this.skillId = skillId;
		this.recruiterId = recruiterId;
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
		this.freelancerid = freelancerid;
	}

	public void setRecruiterId(long recruiterId) {
		this.recruiterId = recruiterId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

}