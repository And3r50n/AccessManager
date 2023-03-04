package com.api.access.manager.application.dto.department;


import com.api.access.manager.domain.model.department.JobTitleKit;

public class JobTitleDto {
	
	private Integer id;
	private Integer code;
	private String name;
	
	public JobTitleDto(JobTitleKit kit) {
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
