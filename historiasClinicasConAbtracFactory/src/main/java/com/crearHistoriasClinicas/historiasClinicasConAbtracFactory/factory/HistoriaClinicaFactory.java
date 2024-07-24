package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.factory;

import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.Consulta;
import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.DatosPersonales;
import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.Tratamiento;

public interface HistoriaClinicaFactory {
    DatosPersonales createDatosPersonales();
    Consulta createConsulta();
    Tratamiento createTratamiento();
}
