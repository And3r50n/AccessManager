package com.api.access.manager.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.access.manager.application.dto.access.ApplicationDTO;
import com.api.access.manager.domain.model.access.Application;
import com.api.access.manager.infrastructure.repositories.ApplicationRepository;

@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationRepository repository;
	
	public List<ApplicationDTO>  getApplications(List<Integer> excepts) {
		List<Application> applications = new ArrayList<>();
		applications = this.repository.getApplications(excepts);
		return applications.stream()
		        .map(ApplicationDTO::new)
		        .collect(Collectors.toList());
	}

}
