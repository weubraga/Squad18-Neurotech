package com.api.neurotechMed_iD.services;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class HospitalService {

    final HospitalRepository hospitalRepository;
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }
    @Transactional
    public Hospital save(Hospital hospital){
        return hospitalRepository.save(hospital);
    }

    public boolean existsByCnpj(Id cnpj) {
        return hospitalRepository.existsByCnpj(cnpj);

    }

    public List<Hospital> findAll() {

        return hospitalRepository.findAll();
    }

    public Optional<Hospital> findById(int iD) {

        return hospitalRepository.findById(iD);
    }
    @Transactional
    public void delete(Hospital hospital) {
        hospitalRepository.delete(hospital);
    }
}
