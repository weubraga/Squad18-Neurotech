package com.api.neurotechMed_iD.repositories;

import com.api.neurotechMed_iD.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    boolean existsByCpf(String cpf);
    Optional<Paciente> findById(UUID id);
}
