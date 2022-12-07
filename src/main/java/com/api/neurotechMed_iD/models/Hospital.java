package com.api.neurotechMed_iD.models;

import javax.persistence.*;
import java.util.List;

import java.util.UUID;
@Table(name = "TB_Hospital")
@Entity

public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;
    @OneToMany
    private List<Paciente> pacientes;
    @Column(name="crm", updatable = true, nullable = false)
    private String crm;
    @Column(name="cob_convenio", updatable = true, nullable = false)
    private String cob_convenio;
    @Column(name="tipo_atendimento", updatable = true, nullable = false)
    private String tipo_atendimento;

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

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCob_convenio() {
        return cob_convenio;
    }

    public void setCob_convenio(String cob_convenio) {
        this.cob_convenio = cob_convenio;
    }

    public String getTipo_atendimento() {
        return tipo_atendimento;
    }

    public void setTipo_atendimento(String tipo_atendimento) {
        this.tipo_atendimento = tipo_atendimento;
    }
}


