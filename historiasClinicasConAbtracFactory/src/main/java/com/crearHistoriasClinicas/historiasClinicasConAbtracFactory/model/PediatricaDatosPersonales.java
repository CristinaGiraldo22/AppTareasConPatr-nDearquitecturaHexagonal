package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class PediatricaDatosPersonales implements DatosPersonales {
    @Override
    public String getInfo() {
        return "Información personal de paciente pediátrico";
    }
}
