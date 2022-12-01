package com.api.neurotechMed_iD.controllers;



import com.api.neurotechMed_iD.dtos.PacienteDto;
import com.api.neurotechMed_iD.models.Paciente;
import com.api.neurotechMed_iD.services.PacientesService;
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
@RequestMapping("/pacientes/api")
public class PacienteController {
    final PacientesService pacientesService;

    public PacienteController(PacientesService pacientesService) {
        this.pacientesService = pacientesService;
    }

    @PostMapping
    public ResponseEntity<Object> savePacientes(@RequestBody @Valid PacienteDto pacienteDto) {
        if(pacientesService.existsByCpf(pacienteDto.getCpf())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: CPF is already in use!");
        }
        Paciente paciente = new Paciente();
        BeanUtils.copyProperties(pacienteDto, paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(pacientesService.save(paciente));
    }


    @GetMapping
    public ResponseEntity<List<Paciente>> getAllPacientes(){
        return ResponseEntity.status(HttpStatus.OK).body(pacientesService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOnePacientes(@PathVariable(value = "id") UUID id){
        Optional<Paciente> pacienteOptional = pacientesService.findById(id);
        if(!pacienteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found");
        } return ResponseEntity.status(HttpStatus.OK).body(pacienteOptional.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePaciente(@PathVariable(value = "id") UUID id){
        Optional<Paciente> pacienteOptional = pacientesService.findById(id);
        if (!pacienteOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID not found.");
        }
        pacientesService.delete(pacienteOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("ID deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePaciente(@PathVariable(value = "id") UUID id,
                                                   @RequestBody @Valid PacienteDto pacienteDto){
        Optional<Paciente> pacienteOptional = pacientesService.findById(id);
        if (!pacienteOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Paciente not found.");
        }

        Paciente paciente = new Paciente();
        BeanUtils.copyProperties(pacienteDto, paciente);
        paciente.setCpf(pacienteOptional.get().getCpf());
        return ResponseEntity.status(HttpStatus.OK).body(pacientesService.save(paciente));

    }





}