package com.api.access.manager.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.access.manager.domain.model.profile.ResumeProfile;

public interface ResumeProfileRepository extends JpaRepository<ResumeProfile, Integer>{

}
