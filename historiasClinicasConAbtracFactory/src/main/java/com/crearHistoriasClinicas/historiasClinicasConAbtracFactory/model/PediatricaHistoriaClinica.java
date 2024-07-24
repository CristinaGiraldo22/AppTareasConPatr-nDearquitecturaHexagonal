package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model;

import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.factory.HistoriaClinicaFactory;

public class PediatricaHistoriaClinica implements HistoriaClinica {
    private DatosPersonales datosPersonales;
    private Consulta consulta;
    private Tratamiento tratamiento;

    public PediatricaHistoriaClinica(HistoriaClinicaFactory factory) {
        this.datosPersonales = factory.createDatosPersonales();
        this.consulta = factory.createConsulta();
        this.tratamiento = factory.createTratamiento();
    }

    @Override
    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    @Override
    public Consulta getConsulta() {
        return consulta;
    }

    @Override
    public Tratamiento getTratamiento() {
        return tratamiento;
    }
}
