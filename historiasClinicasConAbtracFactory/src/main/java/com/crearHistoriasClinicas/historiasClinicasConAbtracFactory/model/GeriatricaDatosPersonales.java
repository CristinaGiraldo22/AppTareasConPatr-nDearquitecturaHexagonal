package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class GeriatricaDatosPersonales implements DatosPersonales {
    @Override
    public String getInfo() {
        return "Información personal de paciente geriátrico";
    }
}
