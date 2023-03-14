package com.api.access.manager.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.access.manager.application.dto.access.ItemDTO;
import com.api.access.manager.application.dto.access.ItemPropertiesDTO;
import com.api.access.manager.application.service.ItemService;


@RestController
@RequestMapping("/api/manager/profile/application/item/")
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@GetMapping()
	public List<ItemDTO> getItens(@RequestParam List<Integer> excepts, Integer id){
		return this.service.getItens(excepts, id);
	}
	
	@GetMapping("properties/{id}")
	public ItemPropertiesDTO findRolesPerAccess(@PathVariable Integer id){
		return this.service.findProperties(id);
	}
	




}
