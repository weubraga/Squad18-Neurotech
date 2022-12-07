package com.api.neurotechMed_iD.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

@Table(name = "TB_Operadora")
@Entity


public class Operadora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String name;
    @OneToMany
    private List<Paciente> paciente;

    @Column(name="cnpj", updatable = true, nullable = true)
    private String cnpj;

    @Column(name="tipoPlano", updatable = true, nullable = true)
    private String tipoPlano;

    @Column(name="areasAtuacao", updatable = true, nullable = true)
    private String areasAtuacao;

    @Column(name="enderecoSede", updatable =true, nullable = true)
    private String enderecoSede;

    @Column(name="especialidades", updatable = true, nullable = true)
    private String especialidades;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getAreasAtuacao() {
        return areasAtuacao;
    }

    public void setAreasAtuacao(String areasAtuacao) {
        this.areasAtuacao = areasAtuacao;
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