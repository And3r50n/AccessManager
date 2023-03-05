package com.api.access.manager.infrastructure.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.api.access.manager.domain.model.access.Application;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ApplicationCustomRepository {
	
	private final EntityManager EM;
	
	public ApplicationCustomRepository(EntityManager EM) {
		this.EM = EM;
	}
	
	public List<Application> findApplications(List<Integer> excepts){
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT a FROM Application a WHERE a.id NOT IN(:expt) AND a.enabled = 1");
		TypedQuery<Application> query = EM.createQuery(builder.toString(), Application.class);
		query.setParameter("expt", excepts);
		return query.getResultList();
	}

}
