package com.hexagonal.tareas.aplicacion.casosdeuso;

import com.hexagonal.tareas.dominio.modelos.Tareas;
import com.hexagonal.tareas.dominio.puertos.entrada.ActualizarTareasCasoUso;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoTareasRepositorio;

import java.util.Optional;

public class ActualizarTareasCasoUsoImplementacion implements ActualizarTareasCasoUso {

    private final PuertoTareasRepositorio puertoTareasRepositorio;

    public ActualizarTareasCasoUsoImplementacion(PuertoTareasRepositorio puertoTareasRepositorio) {
        this.puertoTareasRepositorio = puertoTareasRepositorio;
    }

    @Override
    public Optional<Tareas> actualizarTareas(Long id, Tareas actualizarTareas) {
        return puertoTareasRepositorio.update(actualizarTareas);
    }
}
