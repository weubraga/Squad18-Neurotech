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
    private List<Paciente> paciente;
    @Column(name="crm", updatable = true, nullable = false)
    private String crm;
    @Column(name="cobConvenio", updatable = true, nullable = false)
    private String cobConvenio;
    @Column(name="tipoAtendimento", updatable = true, nullable = false)
    private String tipoAtendimento;

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


