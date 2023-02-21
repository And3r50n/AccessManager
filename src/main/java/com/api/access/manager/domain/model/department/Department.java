package com.api.access.manager.domain.model.department;

import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.Fetch;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.api.access.manager.domain.model.profile.ResumeProfile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="profile_id")
	private ResumeProfile profile;
	
	@OneToMany(mappedBy="department")
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<DepartmentSectionKit> sectionKits;
	
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

	public String getName() {
		return name;
	}

	public ResumeProfile getProfile() {
		return profile;
	}

	public List<DepartmentSectionKit> getSectionKits() {
		return sectionKits;
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
