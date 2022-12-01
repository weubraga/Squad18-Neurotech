package com.api.neurotechMed_iD.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class HospitalDto {

    @NotNull
    @Size(max = 10)
    private String name;

    @NotEmpty
    @Size(max = 10)
    private String crm;

    @NotBlank
    @Size(max = 10)
    private int cob_convenio;

    @NotBlank
    @Size(max = 10)
    private String tipo_atendimento;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public int getCob_convenio() {
        return cob_convenio;
    }

    public void setCob_convenio(int cob_convenio) {
        this.cob_convenio = cob_convenio;
    }

    public String getTipo_atendimento() {
        return tipo_atendimento;
    }

    public void setTipo_atendimento(String tipo_atendimento) {
        this.tipo_atendimento = tipo_atendimento;
    }
}
