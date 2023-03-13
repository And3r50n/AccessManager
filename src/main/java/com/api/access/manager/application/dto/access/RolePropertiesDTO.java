package com.api.access.manager.application.dto.access;

import java.time.LocalDateTime;

import com.api.access.manager.domain.model.access.RoleSet;

public class RolePropertiesDTO {
	
	private Integer id;
	private String name;
	private String attribute;
	private LocalDateTime created;
	private LocalDateTime updated;
	private byte status;
	
	public RolePropertiesDTO(RoleSet roleSet) {
		this.id = roleSet.getId();
		this.name = roleSet.getRole().getName();
		this.attribute = roleSet.getRole().getAttribute();
		this.created = roleSet.getCreated();
		this.updated = roleSet.getUpdated();
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

	public String getAttribute() {
		return attribute;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}
	
	

}
