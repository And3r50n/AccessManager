package com.api.access.manager.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.access.manager.application.dto.access.ItemPropertiesDTO;
import com.api.access.manager.domain.model.access.ItemSetProperties;
import com.api.access.manager.infrastructure.repositories.ItemRepository;


@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public ItemPropertiesDTO findProperties(Integer id) {
		ItemSetProperties item = this.repository.findById(id).get();
		return new ItemPropertiesDTO(item);
	}

}
