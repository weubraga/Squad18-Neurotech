package com.api.neurotechMed_iD.dtos;


import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HospitalDto {

    @NotNull
    @Size(max = 6)
    private Id id;

    @NotBlank
    private String name;

    @NotEmpty
    private String crm;

    @NotBlank
    private int cob_convenio;

    @NotBlank
    private String tipo_atendimento;


    public HospitalDto(Id id) {
        this.id = id;
    }
}
