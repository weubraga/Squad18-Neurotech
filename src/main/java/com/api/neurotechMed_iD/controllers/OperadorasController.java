package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.dtos.OperadoraDto;
import com.api.neurotechMed_iD.models.Operadoras;
import com.api.neurotechMed_iD.services.OperadorasService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/operadoras")
public class OperadorasController {
    final OperadorasService operadorasService;

    public OperadorasController(OperadorasService operadorasService) {
        this.operadorasService = operadorasService;
    }

    @PostMapping
    public ResponseEntity<Object> saveOperadoras(@RequestBody @Valid OperadoraDto operadoraDto) {
        if(operadorasService.existsByCnpj(operadoraDto.getCnpj())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CNPJ is already in use!");
        }

        Operadoras operadoras = new Operadoras();
        BeanUtils.copyProperties(operadoraDto, operadoras);
        return ResponseEntity.status(HttpStatus.CREATED).body(operadorasService.save(operadoras));

    }
    /*@GetMapping
    public ResponseEntity<Page<Operadoras>> getAllOperadoras(){
        return ResponseEntity.status(HttpStatus.OK).body(operadorasService.findAll());
    }*/

    /*@GetMapping("/{id}")
    public ResponseEntity<Object> getOneOperadoras(@PathVariable(value = "id") UUID id){
        Optional<Operadoras> operadorasOptional = operadorasService.findById(id);
        return operadorasOptional.<ResponseEntity<Object>>map(operadoras -> ResponseEntity.status(HttpStatus.OK).body(operadoras)).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found."));
    }*/


}

