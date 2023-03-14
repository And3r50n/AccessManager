package com.api.access.manager.application.dto.access;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.api.access.manager.domain.model.access.ItemSetProperties;

public class ItemPropertiesDTO {

	private Integer id;
	private String application;
	private String name;
	private String environment;
	private LocalDateTime created;
	private LocalDateTime updated;
	private byte status;
	private List<RoleDTO> roles;
	
	
	public ItemPropertiesDTO(ItemSetProperties item) {
		this.roles = new ArrayList<>();
		this.id = item.getId();
		this.application = item.getAccess().getApplication().getName();
		this.name = item.getItem().getName();
		this.environment = item.getItem().getEnvironment();
		this.created = item.getCreated();
		this.updated = item.getUpdated();
		this.status = item.getStatus();
		item.getRolesSet().stream().forEach(roleSet -> this.roles.add(new RoleDTO(roleSet)));	
	}

	public Integer getId() {
		return id;
	}

	public String getApplication() {
		return application;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEnvironment() {
		return environment;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public byte getStatus() {
		return status;
	}
	
	public List<RoleDTO> getRoles() {
		return roles;
	}

}
