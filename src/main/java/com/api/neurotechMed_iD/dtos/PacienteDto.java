package com.api.neurotechMed_iD.dtos;


import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/* Paciente:
* CPF ;
* nome do paciente;   
* número da carteirinha do plano de saúde;
* Status do plano;
* face id e biometria. */


public class PacienteDto {

    @NotNull
    @Size(max = 11)
    private Id cpf;

    @NotBlank
    @Size(max=100)
    private String name;

    @NotBlank
    private int num_carteirinha;

    @NotBlank
    private String status;

    public PacienteDto(Id cpf) {
        this.cpf = cpf;
    }
}