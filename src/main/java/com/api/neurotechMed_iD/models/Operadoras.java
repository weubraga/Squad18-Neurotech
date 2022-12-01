package com.api.neurotechMed_iD.models;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "TB_Operadoras")
@Entity


public class Operadoras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID iD;

    @Column
    private String name;
    @OneToMany
    private List<Paciente> paciente;

    @Column(name="cnpj", updatable = true, nullable = true)
    private int cnpj;

    @Column(name="tipo_plano", updatable = true, nullable = true)
    private int tipo_plano;

    @Column(name="areas_atuacao", updatable = true, nullable = true)
    private String areas_atuacao;

    @Column(name="especialidades", updatable = true, nullable = true)
    private String especialidades;

    @Column(name="status", updatable = true, nullable = true)
    private String status;


    public UUID getiD() {
        return iD;
    }

    public void setiD(UUID iD) {
        this.iD = iD;
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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getTipo_plano() {
        return tipo_plano;
    }

    public void setTipo_plano(int tipo_plano) {
        this.tipo_plano = tipo_plano;
    }

    public String getAreas_atuacao() {
        return areas_atuacao;
    }

    public void setAreas_atuacao(String areas_atuacao) {
        this.areas_atuacao = areas_atuacao;
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