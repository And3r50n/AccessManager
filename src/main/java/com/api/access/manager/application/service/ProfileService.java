package com.api.access.manager.application.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.access.manager.application.dto.SummaryProfileDto;
import com.api.access.manager.application.dto.department.ProfileDto;
import com.api.access.manager.domain.model.profile.Profile;
import com.api.access.manager.infrastructure.repositories.ProfileRepository;


@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository repository;
	
	public List<SummaryProfileDto> findAll() {
	    List<Profile> profiles = this.repository.findAll(); 
	    return profiles.stream()
	            .map(SummaryProfileDto::new)
	            .collect(Collectors.toList());
	}
	
	
	public ProfileDto findById(Integer id) {
		Profile profile = this.repository.findById(id).get();
		return new ProfileDto(profile);
	}

}
