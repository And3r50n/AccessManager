package com.api.access.manager.application.dto.access;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.access.Access;


public class AccessDto {
	
	private Integer id;
	private String name;
	private List<ItemDto> itens;

	
	public AccessDto(Access access) {
		this.itens = new ArrayList<>();
		this.id = access.getId();
		this.name = access.getApplication().getName();
		access.getItems().stream().forEach(item -> this.itens.add(new ItemDto(item)));
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<ItemDto> getItens(){
		return this.itens;
	}

	
}
