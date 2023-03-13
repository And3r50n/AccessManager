package com.api.access.manager.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.access.manager.domain.model.access.RoleSet;

@Repository
public interface RoleRepository extends JpaRepository<RoleSet, Integer>{
	
	@Query(nativeQuery=true, value ="SELECT * FROM role_set WHERE item_set_id like :id")
	List<RoleSet> findRolesPerAccess(@Param("id") Integer id);

}
