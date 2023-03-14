package com.api.access.manager.application.dto.department;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.department.DepartmentSet;


public class DepartmentDTO {
	
	private Integer id;
	private Integer code;
	private String name;
	private List<JobTitleDTO> jobTitles;
	private byte status;
	

	public DepartmentDTO(DepartmentSet kit) {
		this.id = kit.getId();
		this.code = kit.getDepartment().getId();
		this.name = kit.getDepartment().getName();
		this.status = kit.getStatus();
		this.jobTitles =  new ArrayList<>();
		kit.getJobTitleSet().stream().forEach(jobTitleKit -> this.jobTitles.add(new JobTitleDTO(jobTitleKit)));
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

	public List<JobTitleDTO> getJobTitles() {
		return jobTitles;
	}

	public byte getStatus() {
		return status;
	}

	
	
	
	
}
