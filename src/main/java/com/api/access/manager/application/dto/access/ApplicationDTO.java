package com.api.access.manager.application.dto.access;

import com.api.access.manager.domain.model.access.Application;

public class ApplicationDTO {
	
	
	private String name;

	public ApplicationDTO(Application application) {
		this.name = application.getName();
	}	
	
	public String getName() {
		return name;
	}

}
