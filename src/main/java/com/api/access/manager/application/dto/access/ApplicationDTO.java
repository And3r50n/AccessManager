package com.api.access.manager.application.dto.access;

import com.api.access.manager.domain.model.access.Application;

public class ApplicationDTO {
	
	
	private String name;
	private String environment;
	
	
	public ApplicationDTO(Application application) {
		this.name = application.getName();
		this.environment = application.getEnvironment();
	}	
	
	public String getName() {
		return name;
	}
	public String getEnvironment() {
		return environment;
	}
	
	
	
}
