package com.api.neurotechMed_iD.models;

import javax.persistence.*;
@Table(name = "TB_Operadoras")
@Entity


public class Operadoras {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int iD;

    @Column
    private String name;
    public Operadoras() {

    }


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