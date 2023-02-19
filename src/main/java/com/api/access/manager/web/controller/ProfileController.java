package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.access.manager.domain.model.access.Access;
import com.api.access.manager.repositories.AccessRepository;

@RestController
@RequestMapping("/main/profile")
public class ProfileController {
	
	private final AccessRepository repository;
	
	@Autowired
	public ProfileController(AccessRepository repository) {
		this.repository = repository;
	}
	
	public List<Access> findProfiles(){
		//return this.repository.findProfileAccess(id);
		return null;
	}

}
