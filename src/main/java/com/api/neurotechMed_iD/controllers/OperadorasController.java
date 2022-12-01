package com.api.neurotechMed_iD.controllers;


import com.api.neurotechMed_iD.dtos.OperadoraDto;
import com.api.neurotechMed_iD.models.Operadoras;
import com.api.neurotechMed_iD.services.OperadorasService;
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
@RequestMapping("/operadoras/api")

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
    @GetMapping
    public ResponseEntity<List<Operadoras>> getAllOperadoras(){
        return ResponseEntity.status(HttpStatus.OK).body(operadorasService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneOperadoras(@PathVariable(value = "id") UUID id){
        Optional<Operadoras> operadorasOptional = operadorasService.findById(id);
        if(!operadorasOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
        } return ResponseEntity.status(HttpStatus.OK).body(operadorasOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOperadoras(@PathVariable(value = "id") UUID id){
        Optional<Operadoras> operadorasOptional = operadorasService.findById(id);
        if (!operadorasOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found.");
        }
        operadorasService.delete(operadorasOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("ID deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateOperadoras(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid OperadoraDto operadoraDto){
        Optional<Operadoras> operadorasOptional = operadorasService.findById(id);
        if (!operadorasOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Operadora not found.");
        }
        Operadoras operadoras = new Operadoras();
        BeanUtils.copyProperties(operadoraDto, operadoras);
        operadoras.setId(operadorasOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(operadorasService.save(operadoras));

    }


}

