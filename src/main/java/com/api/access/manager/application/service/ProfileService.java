package com.api.access.manager.application.service;


import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.access.manager.application.dto.ProfileDTO;
import com.api.access.manager.application.dto.SummaryProfileDTO;
import com.api.access.manager.domain.model.profile.Profile;
import com.api.access.manager.infrastructure.repositories.ProfileRepository;


@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository repository;
	
	public List<SummaryProfileDTO> findAll() {
	    List<Profile> profiles = this.repository.findAll(); 
	    return profiles.stream()
	            .map(SummaryProfileDTO::new)
	            .collect(Collectors.toList());
	}
	
	
	public ProfileDTO findById(Integer id) {
		Profile profile = this.repository.findById(id).get();
		return new ProfileDTO(profile);
	}

}
