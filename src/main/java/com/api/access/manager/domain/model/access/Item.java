package com.api.access.manager.domain.model.access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="environment")
	private String environment;
	
	@Column(name="application_id")
	private Integer applicationId;
	
	@Column(name="enabled")
	private boolean enabled;

	
	public Integer getId() {
		return id;
	}
	
	public Integer getApplicationId() {
		return applicationId;
	}
	
	public String getEnvironment() {
		return environment;
	}

	public String getName() {
		return name;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	
	

}
