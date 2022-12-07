package com.api.neurotechMed_iD.repositories;

import com.api.neurotechMed_iD.models.Operadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface OperadoraRepository extends JpaRepository<Operadora, Integer> {
    boolean existsByCnpj(String cnpj);

    Optional<Operadora> findById(UUID iD);
}