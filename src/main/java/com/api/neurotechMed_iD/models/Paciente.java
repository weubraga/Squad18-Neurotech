package com.api.neurotechMed_iD.models;


import java.util.List;
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
    private Operadoras operadoras;

    @Column(name="cpf", updatable = true, nullable = true)
    private String cpf;

    @Column(name="id_plano", updatable = true, nullable = true)
    private String id_plano;

    @Column(name="id_face", updatable = true, nullable = true)
    private String id_face;

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

    public Operadoras getOperadoras() {
        return operadoras;
    }

    public void setOperadoras(Operadoras operadoras) {
        this.operadoras = operadoras;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId_plano() {
        return id_plano;
    }

    public void setId_plano(String id_plano) {
        this.id_plano = id_plano;
    }

    public String getId_face() {
        return id_face;
    }

    public void setId_face(String id_face) {
        this.id_face = id_face;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
