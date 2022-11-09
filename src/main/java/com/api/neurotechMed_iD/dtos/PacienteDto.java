package com.api.neurotechMed_iD.dtos;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PacienteDto {

    @NotNull
    private int id;

    @NotBlank
    private String name;

    @NotNull
    private int cpf;

    @NotBlank
    private int id_face;

    @NotBlank
    private int id_plano;

    @NotBlank
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId_face() {
        return id_face;
    }

    public void setId_face(int id_face) {
        this.id_face = id_face;
    }

    public int getId_plano() {
        return id_plano;
    }

    public void setId_plano(int id_plano) {
        this.id_plano = id_plano;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
