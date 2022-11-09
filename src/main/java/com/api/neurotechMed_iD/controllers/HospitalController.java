package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.NeurotechMedIDApplication;
import com.api.neurotechMed_iD.models.Hospital;
import com.api.neurotechMed_iD.repositories.HospitalRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/NeurotechMedID")
public class HospitalController {

    final NeurotechMedIDApplication neurotechMedIDApplication;

    public HospitalController(NeurotechMedIDApplication neurotechMedIDApplication) {
        this.neurotechMedIDApplication = neurotechMedIDApplication;
    }
}
