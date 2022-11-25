package com.api.neurotechMed_iD;

import com.api.neurotechMed_iD.models.Hospital;
import com.api.neurotechMed_iD.models.Paciente;
import com.api.neurotechMed_iD.models.Operadoras;
import com.api.neurotechMed_iD.repositories.HospitalRepository;
import com.api.neurotechMed_iD.repositories.PacienteRepository;
import com.api.neurotechMed_iD.repositories.OperadorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class NeurotechMedIDApplication {


	public static void main(String[] args) {
		SpringApplication.run(NeurotechMedIDApplication.class, args);
	}



}
