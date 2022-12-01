package com.api.neurotechMed_iD.services;

import com.api.neurotechMed_iD.models.Operadoras;
import com.api.neurotechMed_iD.repositories.OperadorasRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OperadorasService {
    final OperadorasRepository operadorasRepository;
    public OperadorasService(OperadorasRepository operadorasRepository) {
        this.operadorasRepository = operadorasRepository;
    }
    @Transactional
    public Operadoras save(Operadoras operadoras){
        return operadorasRepository.save(operadoras);
    }

    public boolean existsByCnpj(int cnpj) {
        return operadorasRepository.existsByCnpj(cnpj);

    }

    public List<Operadoras> findAll() {

        return operadorasRepository.findAll();
    }

    public Optional<Operadoras> findById(UUID iD) {

        return operadorasRepository.findById(iD);
    }
    @Transactional
    public void delete(Operadoras operadoras) {
        operadorasRepository.delete(operadoras);
    }
}
