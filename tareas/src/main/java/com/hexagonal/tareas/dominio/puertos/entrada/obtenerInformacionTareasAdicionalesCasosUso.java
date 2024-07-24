package com.hexagonal.tareas.dominio.puertos.entrada;

import com.hexagonal.tareas.dominio.modelos.InformacionTareasAdicionales;

public interface obtenerInformacionTareasAdicionalesCasosUso {
    InformacionTareasAdicionales obtenerTareasAdicionales(Long id);
}
