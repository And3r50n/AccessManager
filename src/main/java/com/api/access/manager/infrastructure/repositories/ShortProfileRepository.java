package com.api.access.manager.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.access.manager.domain.model.profile.Profile;

public interface ShortProfileRepository extends JpaRepository<Profile, Integer>{

}