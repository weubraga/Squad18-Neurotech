package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.NeurotechMedIDApplication;
import com.api.neurotechMed_iD.models.Hospital;
import com.api.neurotechMed_iD.repositories.HospitalRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/hospital/api")
public class HospitalController {

    @GetMapping("/{name}")
    public String index(@PathVariable String name){
        return "Olá Mundo!";
    }
}
