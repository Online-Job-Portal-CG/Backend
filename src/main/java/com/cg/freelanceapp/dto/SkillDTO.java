package com.cg.freelanceapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**************************************************************************************
 * @author       Amruth N
 * Description : This is the DTO class for Skill module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
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

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

}
