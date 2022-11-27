package com.api.neurotechMed_iD.dtos;


import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/* Operadora:
* Nome da operadora (obg, 100) ;
* CNPJ (obg, 14);   
* Tipos de planos (text, 50);
* Endereço;
* Regiões de atuação;
* Especialidades */


public class OperadoraDto {

    @NotNull
    @Size(max = 14)
    private int cnpj;

    @NotBlank
    @Size(max=100)
    private String name;

    @NotBlank
    @Size(max=50)
    private int tipos_de_planos;

    private String endereço_sede;
    private String regioes;
    private String especialidades;

    public OperadoraDto(int cnpj) {
        this.cnpj = cnpj;
    }


    public Id getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTipos_de_planos() {
        return tipos_de_planos;
    }

    public void setTipos_de_planos(int tipos_de_planos) {
        this.tipos_de_planos = tipos_de_planos;
    }

    public String getEndereço_sede() {
        return endereço_sede;
    }

    public void setEndereço_sede(String endereço_sede) {
        this.endereço_sede = endereço_sede;
    }

    public String getRegioes() {
        return regioes;
    }

    public void setRegioes(String regioes) {
        this.regioes = regioes;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
}