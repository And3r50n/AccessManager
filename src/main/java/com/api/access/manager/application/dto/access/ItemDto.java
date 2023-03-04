package com.api.access.manager.application.dto.access;

import java.util.ArrayList;
import java.util.List;

import com.api.access.manager.domain.model.access.ItemKit;

public class ItemDto {
	
	private Integer id;
	private String name;
	private List<RoleDto> roles;
	
	public ItemDto(ItemKit kit) {
		this.roles = new ArrayList<>();
		this.id = kit.getId();
		this.name = kit.getItem().getName();
		kit.getRolesKit().stream().forEach(role -> this.roles.add(new RoleDto(role)));
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
	public List<RoleDto> getRoles(){
		return this.roles;
	}

}
