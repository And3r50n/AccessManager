package com.api.access.manager.application.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.access.manager.application.dto.access.AccessDTO;
import com.api.access.manager.domain.model.access.Access;
import com.api.access.manager.infrastructure.repositories.AccessRepository;

@Service
public class AccessService {
	
	@Autowired
	private AccessRepository repository;
	
	public List<AccessDTO> findById(Integer id) {
	    List<Access> accesses = this.repository.findAllPerProfile(id); 
	    return accesses.stream()
	            .map(AccessDTO::new)
	            .collect(Collectors.toList());
	}

}
