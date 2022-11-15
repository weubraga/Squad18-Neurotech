package com.api.neurotechMed_iD.models;


import java.util.List;
import javax.persistence.*;
@Table(name = "TB_Paciente")
@Entity


public class Paciente {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int iD;
    @Column
    private String name;
    public Paciente() {

    }

    @ManyToOne
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    @Column(name="cpf", updatable = true, nullable = true)
    private int cpf;

    @Column(name="id_plano", updatable = true, nullable = true)
    private int id_plano;

    @Column(name="id_face", updatable = true, nullable = true)
    private String id_face;

    @Column(name="status", updatable = true, nullable = true)
    private String status;


    public String getName() {
        return name;
    }

    public String getcrm() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }
}
