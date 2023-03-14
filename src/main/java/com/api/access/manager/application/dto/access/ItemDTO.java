package com.api.access.manager.application.dto.access;

import com.api.access.manager.domain.model.access.Item;
import com.api.access.manager.domain.model.access.ItemSet;

public class ItemDTO {
	
	private Integer id;
	private String name;
	private String environment;

	public ItemDTO(ItemSet itemSet) {
		this.id = itemSet.getId();
		this.name = itemSet.getItem().getName();
		this.environment = itemSet.getItem().getEnvironment();
	}
	
	public ItemDTO(Item item) {
		this.id = item.getId();
		this.name = item.getName();
		this.environment = item.getEnvironment();
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
	public String getEnvironment() {
		return this.environment;
	}
	
}
