package com.api.neurotechMed_iD.dtos;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/* Operadora:
* Nome da operadora (obg, 100) ;
* CNPJ (obg, 14);   
* Tipos de planos (text, 50);
* Endereço;
* Regiões de atuação;
* Especialidades */


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
    private String tipos_de_planos;
    @NotBlank
    private String endereço_sede;
    @NotBlank
    private String regioes;
    @NotBlank
    private String especialidades;
    @NotBlank
    private String status;

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

    public String getTipos_de_planos() {
        return tipos_de_planos;
    }

    public void setTipos_de_planos(String tipos_de_planos) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}