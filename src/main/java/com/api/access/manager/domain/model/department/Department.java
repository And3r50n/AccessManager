package com.api.access.manager.domain.model.department;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.Fetch;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@OneToMany(mappedBy="department")
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<DepartmentSectionKit> sectionKit;
	
	@CreatedDate
	@Column(name="created_at")
	private LocalDateTime created;
	
	@LastModifiedDate
	@Column(name="updated_at")
	private LocalDateTime updated;
	
	@Column(name="enabled")
	private boolean enabled;

}
