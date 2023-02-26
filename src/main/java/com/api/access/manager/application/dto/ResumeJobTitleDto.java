package com.api.access.manager.application.dto;


import com.api.access.manager.domain.model.department.JobTitleKit;

public class ResumeJobTitleDto {
	
	private Integer id;
	private Integer code;
	private String name;
	
	public ResumeJobTitleDto() {
	}
	
	public ResumeJobTitleDto(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ResumeJobTitleDto(JobTitleKit kit) {
		this.id = kit.getId();
		this.code = kit.getJobTitle().getId();
		this.name = kit.getJobTitle().getName();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}
	
	
	
}
