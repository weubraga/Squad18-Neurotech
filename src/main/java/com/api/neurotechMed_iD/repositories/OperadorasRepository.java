package com.api.neurotechMed_iD.repositories;

import com.api.neurotechMed_iD.models.Operadoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface OperadorasRepository extends JpaRepository<Operadoras, Integer> {
    boolean existsByCnpj(Id cnpj);


}