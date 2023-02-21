package com.api.access.manager.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.api.access.manager.domain.model.profile.ResumeProfile;

public interface ProfileRepository extends JpaRepository<ResumeProfile, Integer>{

}
