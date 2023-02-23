package com.api.access.manager.infrastructure.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api.access.manager.domain.model.access.Access;

@Repository
@Transactional
public interface AccessRepository extends JpaRepository<Access, Integer>{
	//@Query(nativeQuery=true, value="")
	//List<Access> findProfileAccess(@Param("arg1") Long id);
}
