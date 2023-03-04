package com.api.access.manager.application.dto.department;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.profile.Profile;



public class ProfileDto {
	
	private Integer id;
	private String code;
	private String description;
	private List<SectionDto> sections;
	
	public ProfileDto(Profile profile) {
		this.id = profile.getId();
		this.code = profile.getCode();
		this.description = profile.getDescription();
		this.sections = new ArrayList<>();
		profile.getSections().stream().forEach(section -> this.sections.add(new SectionDto(section)));	
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
	
	public List<SectionDto> getSections() {
		return sections;
	}
	
	

}
