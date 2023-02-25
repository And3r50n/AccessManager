package com.api.access.manager.web.controller;

import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.domain.model.profile.ResumeProfile;
import com.api.access.manager.infrastructure.repositories.ResumeProfileRepository;


@RestController
@RequestMapping("/api/manager/profile")
public class ResumeProfileController {
	
	private final ResumeProfileRepository repository;
	
	public ResumeProfileController(ResumeProfileRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/{id}")
	public Optional<ResumeProfile> findProfile(@PathVariable Integer id){
		return this.repository.findById(id);
	}

}  
