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
    private int cpf;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    private int num_carteirinha;

    @NotBlank
    private String status;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum_carteirinha() {
        return num_carteirinha;
    }

    public void setNum_carteirinha(int num_carteirinha) {
        this.num_carteirinha = num_carteirinha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}