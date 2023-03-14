package com.api.access.manager.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.access.manager.domain.model.access.Application;


@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer>{
	
	@Query(nativeQuery=true, value="SELECT * FROM application AS i WHERE i.id NOT IN(:expt) AND i.enabled = 1")
	List<Application> getApplications(
			@Param("expt") List<Integer> excepts
    );

}
