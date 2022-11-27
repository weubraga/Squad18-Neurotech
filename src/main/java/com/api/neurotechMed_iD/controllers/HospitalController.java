package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.services.HospitalService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
        if(hospitalService.existsByCnpj(hospitalDto.getCnpj())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CNPJ is already in use!");
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
    public ResponseEntity<Object> getOneHospital(@PathVariable(value = "id") int id){
        Optional<Hospital> hospitalOptional = hospitalService.findById(id);
        if(!hospitalOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        } return ResponseEntity.status(HttpStatus.OK).body(hospitalOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteHospital(@PathVariable(value = "id") int id){
        Optional<Hospital> hospitalOptional = hospitalService.findById(id);
        if (!hospitalOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found.");
        }
        hospitalService.delete(hospitalOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("ID deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateHospital(@PathVariable(value = "id") int id,
                                                   @RequestBody @Valid OperadoraDto operadoraDto){
        Optional<Hospital> hospitalOptional = hospitalService.findById(id);
        if (!hospitalOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hospital not found.");
        }
        Hospital hospital = new Hospital();
        //operadoras.setCnpj(operadoras.getCnpj()); Vamos usar cnpj como ID?
        BeanUtils.copyProperties(hospitalDto, hospital);
        hospital.setCpf(hospitalOptional.get().getCpf());
        return ResponseEntity.status(HttpStatus.OK).body(hospitalService.save(hospital));

    }



}
