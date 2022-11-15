package com.api.neurotechMed_iD.dtos;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OperadorasDto {

    @NotNull
    private int id;

    @NotBlank
    private String name;

    @NotNull
    private int cnpj;

    @NotBlank
    private int areas_atuacao;

    @NotBlank
    private String especialidades;

    @NotBlank
    private String status;

    @NotEmpty
    private int tipo_plano;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
