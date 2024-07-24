package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public class GeriatricaConsulta implements Consulta {
    @Override
    public String getDetalle() {
        return "Detalles de consulta geriátrica";
    }
}
