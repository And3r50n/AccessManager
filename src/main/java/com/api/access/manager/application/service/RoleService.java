package com.api.access.manager.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.access.manager.application.dto.access.RoleDTO;
import com.api.access.manager.application.dto.access.RolePropertiesDTO;
import com.api.access.manager.domain.model.access.RoleSet;
import com.api.access.manager.infrastructure.repositories.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository repository;
	
	public List<RoleDTO> findRoles(Integer id) {
		List<RoleSet> role = new ArrayList<>();
		role = this.repository.findRolesPerAccess(id);
		return role.stream()
		        .map(RoleDTO::new) 
		        .collect(Collectors.toList());
	}
	
	public RolePropertiesDTO findProperties(Integer id) {
		RoleSet role = this.repository.findById(id).get();
		return new RolePropertiesDTO(role);
	}


}
