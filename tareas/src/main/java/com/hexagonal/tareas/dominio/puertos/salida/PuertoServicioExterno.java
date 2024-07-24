package com.hexagonal.tareas.dominio.puertos.salida;

import com.hexagonal.tareas.dominio.modelos.InformacionTareasAdicionales;

public interface PuertoServicioExterno {
    InformacionTareasAdicionales obtenerInformacionTareasAdicionales(Long TareasId);
}
