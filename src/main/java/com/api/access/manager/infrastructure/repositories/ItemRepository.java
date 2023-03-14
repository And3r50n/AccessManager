package com.api.access.manager.infrastructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.api.access.manager.domain.model.access.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	@Query(nativeQuery=true, value="SELECT * FROM(SELECT * FROM item WHERE application_id like :id) AS i WHERE i.id NOT IN(:expt) AND i.enabled = 1")
	List<Item> getItens(
			@Param("id") Integer id,
			@Param("expt") List<Integer> excepts
    );

}
