package com.api.access.manager.application.dto;

import java.util.ArrayList;
import java.util.List;

import com.api.access.manager.application.dto.access.AccessDTO;
import com.api.access.manager.application.dto.department.DepartmentDTO;
import com.api.access.manager.domain.model.profile.Profile;



public class ProfileDto {
	
	private Integer id;
	private String code;
	private String description;
	private List<DepartmentDTO> departments;
	private List<AccessDTO> accesses;
	
	public ProfileDto(Profile profile) {
		this.id = profile.getId();
		this.code = profile.getCode();
		this.description = profile.getDescription();
		this.departments = new ArrayList<>();
		this.accesses = new ArrayList<>();
		profile.getAccesses().stream().forEach(access -> this.accesses.add(new AccessDTO(access)));	
		profile.getDepartmentSet().stream().forEach(department -> this.departments.add(new DepartmentDTO(department)));	
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

	public List<DepartmentDTO> getDepartments() {
		return departments;
	}

	public List<AccessDTO> getAccesses() {
		return accesses;
	}

}
