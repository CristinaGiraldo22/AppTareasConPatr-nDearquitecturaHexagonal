package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.factory;


import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.*;
import org.springframework.context.annotation.Configuration;


@Configuration

public class GeriatricaHistoriaClinicaFactory implements HistoriaClinicaFactory {

    @Override
    public DatosPersonales createDatosPersonales() {
        return new GeriatricaDatosPersonales();
    }

    @Override
    public Consulta createConsulta() {
        return new GeriatricaConsulta();
    }

    @Override
    public Tratamiento createTratamiento() {
        return new GeriatricaTratamiento();
    }
}
