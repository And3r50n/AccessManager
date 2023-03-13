package com.api.access.manager.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.access.manager.application.dto.access.ApplicationDTO;
import com.api.access.manager.domain.model.access.Application;
import com.api.access.manager.infrastructure.repositories.ApplicationCustomRepository;

@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationCustomRepository repository;
	
	
	public List<ApplicationDTO>  findAll(List<Integer> excepts) {
		List<Application> applications = new ArrayList<>();
		applications = this.repository.findApplications(excepts);
		return applications.stream()
		        .map(ApplicationDTO::new)
		        .collect(Collectors.toList());
	}

}
