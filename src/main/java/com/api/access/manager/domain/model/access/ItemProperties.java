package com.api.access.manager.domain.model.access;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="item")
public class ItemProperties {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="application_id")
	private Integer applicationId;
	
	@Column(name="url")
	private String url;
	
	@Column(name="ip")
	private String ip;
	
	@CreatedDate
	@Column(name="created_at")
	private LocalDateTime created;
	
	@LastModifiedDate
	@Column(name="updated_at")
	private LocalDateTime updated;
	
	@Column(name="enabled")
	private boolean enabled;

	
	public Integer getId() {
		return id;
	}
	
	public Integer getApplicationId() {
		return applicationId;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getIp() {
		return ip;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public boolean isEnabled() {
		return enabled;
	}

}
