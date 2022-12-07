package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.dtos.OperadoraDto;
import com.api.neurotechMed_iD.models.Operadora;
import com.api.neurotechMed_iD.services.OperadoraService;
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
@RequestMapping("/operadora/api")

public class OperadoraController {
    final OperadoraService operadoraService;

    public OperadoraController(OperadoraService operadoraService) {
        this.operadoraService = operadoraService;
    }

    @PostMapping
    public ResponseEntity<Object> saveOperadora(@RequestBody @Valid OperadoraDto operadoraDto) {
        if(operadoraService.existsByCnpj(operadoraDto.getCnpj())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CNPJ is already in use!");
        }

        Operadora operadora = new Operadora();
        BeanUtils.copyProperties(operadoraDto, operadora);
        return ResponseEntity.status(HttpStatus.CREATED).body(operadoraService.save(operadora));

    }
    @GetMapping
    public ResponseEntity<List<Operadora>> getAllOperadora(){
        return ResponseEntity.status(HttpStatus.OK).body(operadoraService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneOperadora(@PathVariable(value = "id") UUID id){
        Optional<Operadora> operadoraOptional = operadoraService.findById(id);
        if(!operadoraOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        } return ResponseEntity.status(HttpStatus.OK).body(operadoraOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOperadora(@PathVariable(value = "id") UUID id){
        Optional<Operadora> operadoraOptional = operadoraService.findById(id);
        if (!operadoraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found.");
        }
        operadoraService.delete(operadoraOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("ID deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateOperadora(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid OperadoraDto operadoraDto){
        Optional<Operadora> operadoraOptional = operadoraService.findById(id);
        if (!operadoraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Operadora not found.");
        }
        Operadora operadora = new Operadora();
        BeanUtils.copyProperties(operadoraDto, operadora);
        operadora.setId(operadoraOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(operadoraService.save(operadora));

    }


}

