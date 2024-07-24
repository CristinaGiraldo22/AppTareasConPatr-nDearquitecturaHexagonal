package com.hexagonal.tareas.aplicacion.casosdeuso;

import com.hexagonal.tareas.dominio.modelos.InformacionTareasAdicionales;
import com.hexagonal.tareas.dominio.puertos.entrada.obtenerInformacionTareasAdicionalesCasosUso;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoServicioExterno;

public class ObtenerTareasCasoUsoImplementacion implements obtenerInformacionTareasAdicionalesCasosUso {
    private final PuertoServicioExterno puertoServicioExterno;

    public ObtenerTareasCasoUsoImplementacion(PuertoServicioExterno puertoServicioExterno) {
        this.puertoServicioExterno = puertoServicioExterno;
    }

    @Override
    public InformacionTareasAdicionales obtenerTareasAdicionales(Long id) {
        return puertoServicioExterno.obtenerInformacionTareasAdicionales(id);
    }
}
