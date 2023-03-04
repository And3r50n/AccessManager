package com.api.access.manager.application.dto.access;

import com.api.access.manager.domain.model.access.RoleKit;

public class RoleDto {
	
	private Integer id;
	private String name;
	
	public RoleDto(RoleKit kit) {
		this.id = kit.getId();
		this.name = kit.getRole().getName();	
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}


}
