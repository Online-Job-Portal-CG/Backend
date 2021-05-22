package com.cg.freelanceapp.dto;

public class SkillExperienceListDTO {
	private Long id;
	private Long skillId;
	private String skillName;
	private Integer experience;
	private Long freelancerId;
	private String freelancerName;
	private String freelancerUName;

	public SkillExperienceListDTO(Long id, Long skillId, String skillName, Integer experience, Long freelancerId,
			String freelancerName, String freelancerUName) {
		super();
		this.id = id;
		this.skillId = skillId;
		this.skillName = skillName;
		this.experience = experience;
		this.freelancerId = freelancerId;
		this.freelancerName = freelancerName;
		this.freelancerUName = freelancerUName;
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

	public String getFreelancerUName() {
		return freelancerUName;
	}

	public void setFreelancerUName(String freelancerUName) {
		this.freelancerUName = freelancerUName;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

}
