package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class AdultaConsulta implements Consulta {
    @Override
    public String getDetalle() {
        return "Detalles de consulta adulta";
    }
}
