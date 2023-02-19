package com.api.access.manager.domain.model.profile;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="profile")
public class ResumeProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="code")
	@Size(min = 6, max = 8)
	private String code;
	
	@Size(min = 0, max = 255)
	@Column(name="description")
	private String description;
	
	@CreatedDate
	@Column(name="created_at")
	private LocalDateTime created;
	
	@LastModifiedDate
	@Column(name="updated_at")
	private LocalDateTime updated;
	
	@Column(name="enabled")
	private boolean enabled;
	
	
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
