package com.api.access.manager.application.dto;

import java.util.ArrayList;
import java.util.List;

import com.api.access.manager.domain.model.department.Department;

public class ResumeDepartmentDto {

	private Integer id;
	private String name;
	private List<ResumeSectionDto> sections;
	
	public ResumeDepartmentDto() {

	}
	
	public ResumeDepartmentDto(Integer id, String name, List<ResumeSectionDto> sections) {
		this.id = id;
		this.name = name;
		this.sections = sections;
	}
	
	public ResumeDepartmentDto(Department department) {
		this.id = department.getId();
		this.name = department.getName();
		this.sections =  new ArrayList<>();
		department.getSectionKits().stream().forEach(kit -> this.sections.add(new ResumeSectionDto(kit)));	
	}

	
	
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<ResumeSectionDto> getSections() {
		return sections;
	}

	
	
}
