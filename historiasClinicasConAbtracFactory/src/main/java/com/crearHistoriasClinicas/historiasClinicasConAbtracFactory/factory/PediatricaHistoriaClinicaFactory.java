package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.factory;

import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.*;
import org.springframework.stereotype.Component;

@Component
public class PediatricaHistoriaClinicaFactory implements HistoriaClinicaFactory {

    @Override
    public DatosPersonales createDatosPersonales() {
        return new PediatricaDatosPersonales();
    }

    @Override
    public Consulta createConsulta() {
        return new PediatricaConsulta();
    }

    @Override
    public Tratamiento createTratamiento() {
        return new PediatricaTratamiento();
    }
}