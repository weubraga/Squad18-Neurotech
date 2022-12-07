package com.api.neurotechMed_iD.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class OperadoraDto {

    @NotBlank
    @Size(max = 14)
    private String cnpj;
    @NotBlank
    @Size(max=100)
    private String name;
    @NotBlank
    private String areasDeAtuacao;
    @NotBlank
    @Size(max=50)
    private String tiposDePlanos;
    @NotBlank
    private String enderecoSede;

    @NotBlank
    private String especialidades;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreasDeAtuacao() {
        return areasDeAtuacao;
    }

    public void setAreasDeAtuacao(String areasDeAtuacao) {
        this.areasDeAtuacao = areasDeAtuacao;
    }

    public String getTiposDePlanos() {
        return tiposDePlanos;
    }

    public void setTiposDePlanos(String tiposDePlanos) {
        this.tiposDePlanos = tiposDePlanos;
    }

    public String getEnderecoSede() {
        return enderecoSede;
    }

    public void setEnderecoSede(String enderecoSede) {
        this.enderecoSede = enderecoSede;
    }


    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

}