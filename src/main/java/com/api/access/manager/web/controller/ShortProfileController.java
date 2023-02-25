package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.domain.model.profile.Profile;
import com.api.access.manager.infrastructure.repositories.ShortProfileRepository;


@RestController
@RequestMapping("/api/manager/profile")
public class ShortProfileController {
	
	private final ShortProfileRepository repository;
	
	public ShortProfileController(ShortProfileRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/all")
	public List<Profile> findAllProfiles(){
		return (List<Profile>) this.repository.findAll();
	}
	
}  
