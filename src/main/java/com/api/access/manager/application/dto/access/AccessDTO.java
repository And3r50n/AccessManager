package com.api.access.manager.application.dto.access;

import java.util.ArrayList;
import java.util.List;
import com.api.access.manager.domain.model.access.Access;


public class AccessDTO {
	
	private Integer id;
	private String name;
	private Integer applicationId; 
	private List<ItemDTO> itens;

	
	public AccessDTO(Access access) {
		this.itens = new ArrayList<>();
		this.id = access.getId();
		this.name = access.getApplication().getName();
		this.applicationId = access.getApplication().getId();
		access.getItens().stream().forEach(item -> this.itens.add(new ItemDTO(item)));
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public Integer getApplicationId() {
		return this.applicationId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<ItemDTO> getItens(){
		return this.itens;
	}

	
}
