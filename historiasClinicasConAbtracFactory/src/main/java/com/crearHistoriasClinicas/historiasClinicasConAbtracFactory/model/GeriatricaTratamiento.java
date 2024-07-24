package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class GeriatricaTratamiento implements Tratamiento {
    @Override
    public String getPlan() {
        return "Plan de tratamiento geriátrico";
    }
}
