package com.api.neurotechMed_iD.repositories;

import com.api.neurotechMed_iD.models.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    boolean existsByCpf(Id cpf);
    Optional<Paciente> findById(UUID cpf);
}
