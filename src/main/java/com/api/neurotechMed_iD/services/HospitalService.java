package com.api.neurotechMed_iD.services;

import com.api.neurotechMed_iD.models.Hospital;
import com.api.neurotechMed_iD.repositories.HospitalRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class HospitalService {

    final HospitalRepository hospitalRepository;
    public HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;

    }
    @Transactional
    public Hospital save(Hospital hospital){
        return hospitalRepository.save(hospital);
    }

    public boolean existsByCrm(String crm) {
        return hospitalRepository.existsByCrm(crm);

    }
    public List<Hospital> findAll() {

        return hospitalRepository.findAll();
    }

    public Optional<Hospital> findById(UUID iD) {

        return hospitalRepository.findById(iD);
    }
    @Transactional
    public void delete(Hospital hospital) {
        hospitalRepository.delete(hospital);
    }
}
