package com.api.access.manager.domain.model.access;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="item_set")
public class ItemSet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="access_id")
	private Access access;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
		
	@Column(name="status")
	private byte status;


	public Integer getId() {
		return id;
	}

	public Access getAccess() {
		return access;
	}

	public Item getItem() {
		return item;
	}
	
	public byte getStatus() {
		return status;
	}
	
	
}
