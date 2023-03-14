package com.api.access.manager.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.access.manager.application.dto.access.ItemDTO;
import com.api.access.manager.application.dto.access.ItemPropertiesDTO;
import com.api.access.manager.domain.model.access.Item;
import com.api.access.manager.domain.model.access.ItemSetProperties;
import com.api.access.manager.infrastructure.repositories.ItemRepository;
import com.api.access.manager.infrastructure.repositories.ItemSetRepository;


@Service
public class ItemService {
	
	@Autowired
	private ItemSetRepository itemSetRepository;
	
	@Autowired
	private ItemRepository itemRepository;

	
	
	public List<ItemDTO> getItens(List<Integer> excepts, Integer id) {
		List<Item> itens = new ArrayList<>();
		itens = this.itemRepository.getItens(id, excepts);
		return itens.stream()
		        .map(ItemDTO::new)
		        .collect(Collectors.toList());
	}
	
	public ItemPropertiesDTO findProperties(Integer id) {
		ItemSetProperties item = this.itemSetRepository.findById(id).get();
		return new ItemPropertiesDTO(item);
	}
	


}
