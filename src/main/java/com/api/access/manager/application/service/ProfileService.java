package com.api.access.manager.application.service;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.access.manager.application.dto.ResumeProfileDTO;
import com.api.access.manager.application.dto.SummaryProfileDTO;
import com.api.access.manager.domain.model.profile.Profile;
import com.api.access.manager.infrastructure.repositories.ProfileRepository;


@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository repository;
	
	public List<SummaryProfileDTO> findAll() {
		List<Profile> profiles = this.repository.findAll(); 
		List<SummaryProfileDTO> dto = new ArrayList<>();;
		profiles.forEach(profile -> dto.add(new SummaryProfileDTO(profile)));
		return dto;
	}
	
	
	public ResumeProfileDTO findById(Integer id) {
		Profile profile = this.repository.findById(id).get();
		ResumeProfileDTO dto = new ResumeProfileDTO(profile);
		return dto;
	}

}
