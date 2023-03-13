package com.api.access.manager.application.dto.access;

import com.api.access.manager.domain.model.access.RoleSet;

public class RoleDTO {
	
	private Integer id;
	private String name;
	private byte status;
	
	public RoleDTO(RoleSet roleSet) {
		this.id = roleSet.getId();
		this.name = roleSet.getRole().getName();
		this.status = roleSet.getStatus();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public byte getStatus() {
		return status;
	}


}
