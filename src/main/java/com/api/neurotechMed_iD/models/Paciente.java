package com.api.neurotechMed_iD.models;


import java.util.UUID;
import javax.persistence.*;
@Table(name = "TB_Paciente")
@Entity


public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;

    @ManyToOne
    private Hospital hospital;

    @ManyToOne
    private Operadora operadora;

    @Column(name="cpf", updatable = true, nullable = true)
    private String cpf;

    @Column(name="numCarteirinha", updatable = true, nullable = true)
    private String numCarteirinha;

    @Column(name="idFace", updatable = true, nullable = true)
    private String idFace;

    @Column(name="status", updatable = true, nullable = true)
    private String status;

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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumCarteirinha() {
        return numCarteirinha;
    }

    public void setNumCarteirinha(String numCarteirinha) {
        this.numCarteirinha = numCarteirinha;
    }

    public String getIdFace() {
        return idFace;
    }

    public void setIdFace(String idFace) {
        this.idFace = idFace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
