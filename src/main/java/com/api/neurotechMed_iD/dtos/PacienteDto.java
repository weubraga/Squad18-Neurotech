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

    @NotBlank
    @Size(max = 11)
    private String cpf;
    @NotBlank
    @Size(max = 100)
    private String name;
    @NotBlank
    @Size(max = 20)
    private String num_carteirinha;
    @NotBlank
    private String status;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum_carteirinha() {
        return num_carteirinha;
    }

    public void setNum_carteirinha(String num_carteirinha) {
        this.num_carteirinha = num_carteirinha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}