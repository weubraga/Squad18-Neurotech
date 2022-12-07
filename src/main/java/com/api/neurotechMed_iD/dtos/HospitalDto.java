package com.api.neurotechMed_iD.dtos;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class HospitalDto {

    @NotBlank
    @Size(max = 10)
    private String name;

    @NotBlank
    @Size(max = 10)
    private String crm;

    @NotBlank
    @Size(max = 10)
    private String cobConvenio;

    @NotBlank
    @Size(max = 10)
    private String tipoAtendimento;

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

    public String getCobConvenio() {
        return cobConvenio;
    }

    public void setCobConvenio(String cobConvenio) {
        this.cobConvenio = cobConvenio;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }
}
