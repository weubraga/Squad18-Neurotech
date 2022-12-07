package com.api.neurotechMed_iD.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PacienteDto {

    @NotBlank
    @Size(max = 11)
    private String cpf;
    @NotBlank
    @Size(max = 100)
    private String name;
    @NotBlank
    @Size(max = 20)
    private String numCarteirinha;
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

    public String getNumCarteirinha() {
        return numCarteirinha;
    }

    public void setNumCarteirinha(String numCarteirinha) {
        this.numCarteirinha = numCarteirinha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}