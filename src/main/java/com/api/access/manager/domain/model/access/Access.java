package com.api.access.manager.domain.model.access;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.Fetch;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.api.access.manager.domain.model.profile.Profile;

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
@Table(name="access")
public class Access {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;
	
	@ManyToOne
	@JoinColumn(name="application_id")
	private Application application;
	
	@OneToMany(mappedBy="access")
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<ItemSet> itens;
	
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
	
	public LocalDateTime getCreated() {
		return created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public int getStatus() {
		return status;
	}

	public Application getApplication() {
		return application;
	}
	
	public List<ItemSet> getItens() {
		return itens;
	}
	
	
	

}
