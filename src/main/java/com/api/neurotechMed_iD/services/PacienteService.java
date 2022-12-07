package com.api.neurotechMed_iD.services;

import com.api.neurotechMed_iD.models.Paciente;
import com.api.neurotechMed_iD.repositories.PacienteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PacienteService {
    final PacienteRepository pacienteRepository;
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }


    @Transactional
    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public boolean existsByCpf(String cpf) {
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
