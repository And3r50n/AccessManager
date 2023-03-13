package com.api.access.manager.application.dto.department;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.department.DepartmentSet;


public class DepartmentDto {
	
	private Integer id;
	private Integer code;
	private String name;
	private List<JobTitleDto> jobTitles;
	private byte status;
	

	public DepartmentDto(DepartmentSet kit) {
		this.id = kit.getId();
		this.code = kit.getDepartment().getId();
		this.name = kit.getDepartment().getName();
		this.status = kit.getStatus();
		this.jobTitles =  new ArrayList<>();
		kit.getJobTitleSet().stream().forEach(jobTitleKit -> this.jobTitles.add(new JobTitleDto(jobTitleKit)));
	}

	

	public Integer getId() {
		return id;
	}
	
	public Integer getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public List<JobTitleDto> getJobTitles() {
		return jobTitles;
	}

	public byte getStatus() {
		return status;
	}

	
	
	
	
}
