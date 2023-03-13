package com.api.access.manager.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.application.dto.access.AccessDTO;
import com.api.access.manager.application.service.AccessService;

@RestController
@RequestMapping("/api/manager/profile/access/")
public class AccessController {
	
	
	@Autowired
	private AccessService service;
	
	@GetMapping("{id}")
	public List<AccessDTO> findAccessesPerProfile(@PathVariable Integer id){
		return this.service.findById(id);
	}

}
