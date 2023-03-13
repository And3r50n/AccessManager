package com.api.access.manager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.application.dto.access.ItemPropertiesDTO;
import com.api.access.manager.application.service.ItemService;


@RestController
@RequestMapping("/api/manager/profile/access/item/")
public class ItemController {
	
	@Autowired
	private ItemService service;
	
	@GetMapping("properties/{id}")
	public ItemPropertiesDTO findRolesPerAccess(@PathVariable Integer id){
		return this.service.findProperties(id);
	}


}
