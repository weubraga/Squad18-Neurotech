package com.api.neurotechMed_iD.models;

import java.util.List;
import javax.persistence.*;
@Table(name = "TB_Hospital")
@Entity

public class Hospital {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int iD;

    @Column
    private String name;
    public Hospital() {

    }

    @OneToMany(targetEntity = Paciente.class)
    private List Paciente;

    @Column(name="id", updatable = true, nullable = false)
    private int id;

    @Column(name="crm", updatable = true, nullable = false)
    private int crm;

    @Column(name="cob_convenio", updatable = true, nullable = false)
    private int cob_convenio;

    @Column(name="tipo_atendimento", updatable = true, nullable = false)
    private String tipo_atendimento;

    public Hospital(String name) {
        this.name = name;
    }

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


