package com.api.access.manager.application.dto;

import com.api.access.manager.domain.model.profile.Profile;

public class SummaryProfileDTO {
	
	private Integer id;
	private String code;
	private String description;
	
	
	public SummaryProfileDTO() {

	}
	
	public SummaryProfileDTO(Integer id, String code, String description) {
		this.id = id;
		this.code = code;
		this.description = description;
	}
	
	public SummaryProfileDTO(Profile profile) {
		this.id = profile.getId();
		this.code = profile.getCode();
		this.description = profile.getDescription();
	}

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
