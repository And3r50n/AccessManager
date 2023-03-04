package com.api.access.manager.application.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.access.manager.application.dto.access.AccessDto;
import com.api.access.manager.domain.model.access.Access;
import com.api.access.manager.infrastructure.repositories.AccessRepository;

@Service
public class AccessService {
	
	@Autowired
	private AccessRepository repository;
	
	public List<AccessDto> findById(Integer id) {
	    List<Access> accesses = this.repository.findAllPerProfile(id); 
	    return accesses.stream()
	            .map(AccessDto::new)
	            .collect(Collectors.toList());
	}

	
	
	
	
}
