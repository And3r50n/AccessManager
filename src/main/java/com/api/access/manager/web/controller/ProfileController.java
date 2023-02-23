package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.domain.model.profile.ResumeProfile;
import com.api.access.manager.infrastructure.repositories.ProfileRepository;

@RestController
@RequestMapping("/api/manager/profile")
public class ProfileController {
	
	private final ProfileRepository repository;
	
	public ProfileController(ProfileRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/all")
	public List<ResumeProfile> findAllProfiles(){
		return (List<ResumeProfile>) this.repository.findAll();
	}

}  
