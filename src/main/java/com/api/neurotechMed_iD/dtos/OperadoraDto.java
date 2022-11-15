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
    private Id cnpj;

    @NotBlank
    @Size(max=100)
    private String name;

    @NotBlank
    @Size(max=50)
    private int tipos_de_planos;

    private String endereço_sede;
    private String regioes;
    private String especialidades;

    public OperadoraDto(Id cnpj) {
        this.cnpj = cnpj;
    }
}