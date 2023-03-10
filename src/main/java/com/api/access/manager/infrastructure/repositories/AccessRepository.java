package com.api.access.manager.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.access.manager.domain.model.access.Access;

@Repository
public interface AccessRepository extends JpaRepository<Access, Integer>{
	
	@Query(nativeQuery=true, value ="SELECT * FROM access WHERE profile_id like :id")
	List<Access> findAllPerProfile(@Param("id") Integer id);

}
