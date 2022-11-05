package com.api.neurotechMed_iD.models;

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

    @Column(name="crm", updatable = true, nullable = true)
    private int crm;

    @Column(name="cob_convenio", updatable = true, nullable = true)
    private int cob_convenio;

    @Column(name="tipo_atendimento", updatable = true, nullable = true)
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


