package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.domain.model.profile.ResumeProfile;
import com.api.access.manager.repositories.ProfileRepository;



@RestController
@RequestMapping("/main/profile")
public class ProfileController {
	
	private final ProfileRepository repository;
	
	@Autowired
	public ProfileController(ProfileRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<ResumeProfile> findAllProfiles(){
		return this.repository.findAll();
	}

}
