package com.api.access.manager.domain.model.access;

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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="item_set")
public class ItemSetProperties {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="access_id")
	private Access access;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private ItemProperties item;
	
	@OneToMany(mappedBy="itens")
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<RoleSet> roles;
	
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

	public Access getAccess() {
		return access;
	}

	public void setAccess(Access access) {
		this.access = access;
	}

	public ItemProperties getItem() {
		return item;
	}

	public List<RoleSet> getRolesSet() {
		return roles;
	}

	public void setRoles(List<RoleSet> roles) {
		this.roles = roles;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}
	
	

}
