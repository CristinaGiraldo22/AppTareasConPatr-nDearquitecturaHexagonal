package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class AdultaDatosPersonales implements DatosPersonales {
    @Override
    public String getInfo() {
        return "Información personal de paciente adulto";
    }
}
