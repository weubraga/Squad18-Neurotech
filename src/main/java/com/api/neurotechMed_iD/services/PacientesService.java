package com.api.neurotechMed_iD.services;

import com.api.neurotechMed_iD.models.Paciente;
import com.api.neurotechMed_iD.repositories.PacienteRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PacientesService {
    final PacienteRepository pacienteRepository;
    public PacientesService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    @Transactional
    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public boolean existsByCpf(int cpf) {
        return pacienteRepository.existsByCpf(cpf);

    }
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findById(UUID cpf) {
        return pacienteRepository.findById(cpf);
    }
    @Transactional
    public void delete(Paciente paciente) {
        pacienteRepository.delete(paciente);
    }
}
