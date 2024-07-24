package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.factory;


import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.*;
import org.springframework.stereotype.Component;

@Component

public class AdultaHistoriaClinicaFactory implements HistoriaClinicaFactory {

    @Override
    public DatosPersonales createDatosPersonales() {
        return new AdultaDatosPersonales();
    }

    @Override
    public Consulta createConsulta() {
        return new AdultaConsulta();
    }

    @Override
    public Tratamiento createTratamiento() {
        return new AdultaTratamiento();
    }
}
