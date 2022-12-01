package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.dtos.HospitalDto;
import com.api.neurotechMed_iD.models.Hospital;
import com.api.neurotechMed_iD.services.HospitalService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/hospital/api")

public class HospitalController {
    final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }


    @PostMapping
    public ResponseEntity<Object> saveHospital(@RequestBody @Valid HospitalDto hospitalDto) {
        if(hospitalService.existsByCrm(hospitalDto.getCrm())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CRM is already in use!");
        }

        Hospital hospital = new Hospital();
        BeanUtils.copyProperties(hospitalDto, hospital);
        return ResponseEntity.status(HttpStatus.CREATED).body(hospitalService.save(hospital));

    }

    @GetMapping
    public ResponseEntity<List<Hospital>> getAllHospital(){
        return ResponseEntity.status(HttpStatus.OK).body(hospitalService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneHospital(@PathVariable(value = "id") UUID id){
        Optional<Hospital> hospitalOptional = hospitalService.findById(id);
        if(!hospitalOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        } return ResponseEntity.status(HttpStatus.OK).body(hospitalOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteHospital(@PathVariable(value = "id") UUID id){
        Optional<Hospital> hospitalOptional = hospitalService.findById(id);
        if (!hospitalOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found.");
        }
        hospitalService.delete(hospitalOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("ID deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateHospital(@PathVariable(value = "id") UUID id,
                                                   @RequestBody @Valid HospitalDto hospitalDto){
        Optional<Hospital> hospitalOptional = hospitalService.findById(id);
        if (!hospitalOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hospital not found.");
        }
        Hospital hospital = new Hospital();
        BeanUtils.copyProperties(hospitalDto, hospital);
        hospital.setId(hospitalOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(hospitalService.save(hospital));

    }

}
