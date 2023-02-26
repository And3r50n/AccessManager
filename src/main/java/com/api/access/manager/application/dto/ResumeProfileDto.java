package com.api.access.manager.application.dto;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.profile.Profile;



public class ResumeProfileDto {
	
	private Integer id;
	private String code;
	private String description;
	private List<ResumeDepartmentDto> departments;
	
	public ResumeProfileDto() {

	}
	
	public ResumeProfileDto(Integer id, String code, String description) {
		this.id = id;
		this.code = code;
		this.description = description;
	}
	
	public ResumeProfileDto(Profile profile) {
		this.id = profile.getId();
		this.code = profile.getCode();
		this.description = profile.getDescription();
		this.departments = new ArrayList<>();
		profile.getDepartments().stream().forEach(department -> this.departments.add(new ResumeDepartmentDto(department)));	
	}


	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}


	public String getDescription() {
		return description;
	}
	
	public List<ResumeDepartmentDto> getDepartments() {
		return departments;
	}
	
	

}
