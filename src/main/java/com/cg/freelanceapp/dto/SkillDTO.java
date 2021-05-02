package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class SkillDTO {
	@NotEmpty(message = "Skill cannot be blank")
	private String name;
	@NotBlank(message = "Skill description cannot be empty")
	private String description;

	public SkillDTO() {
		super();
	}

	public SkillDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
