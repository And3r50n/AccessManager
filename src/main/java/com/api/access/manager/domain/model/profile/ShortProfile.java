package com.api.access.manager.domain.model.profile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="profile")
public class ShortProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="description")
	private String description;
	
	
	public long getId() {
		return id;
	}
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}

	
	

}
