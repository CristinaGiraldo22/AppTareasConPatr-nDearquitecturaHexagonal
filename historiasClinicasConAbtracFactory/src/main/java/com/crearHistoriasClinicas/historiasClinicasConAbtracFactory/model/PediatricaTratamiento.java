package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class PediatricaTratamiento implements Tratamiento {
    @Override
    public String getPlan() {
        return "Plan de tratamiento pediátrico";
    }
}
