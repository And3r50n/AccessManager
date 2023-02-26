package com.api.access.manager.application.dto;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.department.Department;
import com.api.access.manager.domain.model.profile.Profile;



public class ResumeProfileDTO {
	
	private Integer id;
	private String code;
	private String description;
	private List<Department> departments = new ArrayList<>();
	
	public ResumeProfileDTO() {

	}
	
	public ResumeProfileDTO(Integer id, String code, String description) {
		this.id = id;
		this.code = code;
		this.description = description;
	}
	
	public ResumeProfileDTO(Profile profile) {
		this.id = profile.getId();
		this.code = profile.getCode();
		this.description = profile.getDescription();
		this.departments = profile.getDepartments();
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
	
	public List<Department> getDepartments() {
		return departments;
	}
	
	

}
