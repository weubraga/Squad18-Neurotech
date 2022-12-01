package com.api.neurotechMed_iD.repositories;

import com.api.neurotechMed_iD.models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

    boolean existsByCrm(String crm);

    Optional<Hospital> findById(UUID iD);
}

