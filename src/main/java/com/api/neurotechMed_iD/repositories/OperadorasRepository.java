package com.api.neurotechMed_iD.repositories;

import com.api.neurotechMed_iD.models.Operadoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface OperadorasRepository extends JpaRepository<Operadoras, Integer> {
    boolean existsByCnpj(int cnpj);

    Optional<Operadoras> findById(UUID iD);
}