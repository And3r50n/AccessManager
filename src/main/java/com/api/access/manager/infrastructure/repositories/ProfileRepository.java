package com.api.access.manager.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.access.manager.domain.model.profile.Profile;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
