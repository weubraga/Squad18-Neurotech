package com.api.neurotechMed_iD.services;

import com.api.neurotechMed_iD.models.Operadora;
import com.api.neurotechMed_iD.repositories.OperadoraRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OperadoraService {
    final OperadoraRepository operadoraRepository;
    public OperadoraService(OperadoraRepository operadoraRepository) {
        this.operadoraRepository = operadoraRepository;
    }
    @Transactional
    public Operadora save(Operadora operadora){
        return operadoraRepository.save(operadora);
    }

    public boolean existsByCnpj(String cnpj) {
        return operadoraRepository.existsByCnpj(cnpj);

    }

    public List<Operadora> findAll() {

        return operadoraRepository.findAll();
    }

    public Optional<Operadora> findById(UUID iD) {

        return operadoraRepository.findById(iD);
    }
    @Transactional
    public void delete(Operadora operadora) {
        operadoraRepository.delete(operadora);
    }
}
