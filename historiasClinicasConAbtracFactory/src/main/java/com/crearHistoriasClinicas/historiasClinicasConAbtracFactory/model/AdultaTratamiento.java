package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class AdultaTratamiento implements Tratamiento {
    @Override
    public String getPlan() {
        return "Plan de tratamiento adulto";
    }
}
