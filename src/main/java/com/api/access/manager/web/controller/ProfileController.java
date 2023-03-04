package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.access.manager.application.dto.SummaryProfileDto;
import com.api.access.manager.application.dto.department.ProfileDto;
import com.api.access.manager.application.service.ProfileService;


@RestController
@RequestMapping("/api/manager/profile")
public class ProfileController {
	
	@Autowired
	private ProfileService service;
	

	@GetMapping("/all")
	public List<SummaryProfileDto> findAllProfiles(){
		return this.service.findAll();
	}
	
	@GetMapping("/{id}")
	public ProfileDto findProfile(@PathVariable Integer id){
		return this.service.findById(id);
	}

}
