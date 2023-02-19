package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.access.manager.domain.model.access.Access;
import com.api.access.manager.repositories.AccessRepository;

@RestController
@RequestMapping("/main/profile/access")
public class AccessController {
	
	private final AccessRepository repository;
	
	@Autowired
	public AccessController(AccessRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/{id}")
	public List<Access> getAccesses(@PathVariable Integer id){
		//return this.repository.getAccessToProfile(id);
		return null;
	}

}
