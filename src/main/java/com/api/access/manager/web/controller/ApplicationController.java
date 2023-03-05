package com.api.access.manager.web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.api.access.manager.application.dto.access.ApplicationDto;
import com.api.access.manager.application.service.ApplicationService;


@RestController
@RequestMapping("/api/application")
public class ApplicationController {
	
	@Autowired
	private ApplicationService service;
	
	
	@GetMapping("/all")
	public List<ApplicationDto> findAll(@RequestParam List<Integer> excepts){
		return this.service.findAll(excepts);
	}

}
