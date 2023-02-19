package com.api.access.manager.domain.model.department;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="department_section_kit")
public class DepartmentSectionKit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name="section_id")
	private Section section;
	
	@CreatedDate
	@Column(name="created_at")
	private LocalDateTime created;
	
	@LastModifiedDate
	@Column(name="updated_at")
	private LocalDateTime updated;
	
	@Column(name="status")
	private byte status;

	
	
	
	public Integer getId() {
		return id;
	}

	public Department getDepartment() {
		return department;
	}

	public Section getSection() {
		return section;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public byte getStatus() {
		return status;
	}
	

	
	
	
	
}
