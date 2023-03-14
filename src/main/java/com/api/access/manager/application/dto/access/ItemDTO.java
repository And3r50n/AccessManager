package com.api.access.manager.application.dto.access;

import com.api.access.manager.domain.model.access.Item;
import com.api.access.manager.domain.model.access.ItemSet;

public class ItemDTO {
	
	private Integer id;
	private String name;

	public ItemDTO(ItemSet itemSet) {
		this.id = itemSet.getId();
		this.name = itemSet.getItem().getName();
	}
	
	public ItemDTO(Item item) {
		this.id = item.getId();
		this.name = item.getName();
	}
	
	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
}
