package com.api.access.manager.domain.model.profile;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.Fetch;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.api.access.manager.domain.model.access.Access;
import com.api.access.manager.domain.model.department.DepartmentSet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "code")
	private String code;

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "profile")
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<DepartmentSet> departmentSet;
	
	@OneToMany(mappedBy = "profile")
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<Access> accesses;
	
	@CreatedDate
	@Column(name = "created_at")
	private LocalDateTime created;

	@LastModifiedDate
	@Column(name = "updated_at")
	private LocalDateTime updated;

	@Column(name = "enabled")
	private boolean enabled;

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public List<DepartmentSet> getDepartmentSet() {
		return departmentSet;
	}
	
	public List<Access> getAccesses() {
		return accesses;
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
