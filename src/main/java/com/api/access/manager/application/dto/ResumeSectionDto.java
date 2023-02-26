package com.api.access.manager.application.dto;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.department.SectionsKit;

public class ResumeSectionDto {
	
	private Integer id;
	private Integer code;
	private String name;
	private List<ResumeJobTitleDto> jobTitles;
	private byte status;
	
	public ResumeSectionDto() {

	}
	
	public ResumeSectionDto(Integer id, String name, List<ResumeJobTitleDto> jobTitles, byte status) {
		this.code = id;
		this.name = name;
		this.jobTitles = jobTitles;
		this.status = status;
	}
	
	public ResumeSectionDto(SectionsKit sectionKit) {
		this.id = sectionKit.getId();
		this.code = sectionKit.getSection().getId();
		this.name = sectionKit.getSection().getName();
		this.status = sectionKit.getStatus();
		this.jobTitles =  new ArrayList<>();
		sectionKit.getJobTitleKits().stream().forEach(jobTitleKit -> this.jobTitles.add(new ResumeJobTitleDto(jobTitleKit)));
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

	public List<ResumeJobTitleDto> getJobTitles() {
		return jobTitles;
	}

	public byte getStatus() {
		return status;
	}

	
	
	
	
}
