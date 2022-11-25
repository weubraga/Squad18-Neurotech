package com.api.neurotechMed_iD.models;

import com.api.neurotechMed_iD.models.Hospital;

public class HospitalCRUD {

    public void save(Hospital hospital) {
        String sql = "INSERT INTO hospital(id, name, crm, cob_convenio, tipo_atendimento) VALUES (?, ?, ?, ?, ?)";
    }

}
