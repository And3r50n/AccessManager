package com.api.access.manager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.application.dto.access.RolePropertiesDTO;
import com.api.access.manager.application.service.RoleService;


@RestController
@RequestMapping("api/manager/profile/access/item/role/")
public class RoleController {
	

	@Autowired
	private RoleService service;
	
	@GetMapping("properties/{id}")
	public RolePropertiesDTO findProperties(@PathVariable Integer id){
		return this.service.findProperties(id);
	}

}
