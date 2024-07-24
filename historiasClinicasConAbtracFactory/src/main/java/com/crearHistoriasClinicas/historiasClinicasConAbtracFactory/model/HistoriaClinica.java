package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

public interface HistoriaClinica {
    DatosPersonales getDatosPersonales();
    Consulta getConsulta();
    Tratamiento getTratamiento();
}
