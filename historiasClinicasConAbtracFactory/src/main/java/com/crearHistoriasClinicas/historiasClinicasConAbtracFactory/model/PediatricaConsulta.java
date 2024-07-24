package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class PediatricaConsulta implements Consulta {
    @Override
    public String getDetalle() {
        return "Detalles de consulta pediátrica";
    }
}
