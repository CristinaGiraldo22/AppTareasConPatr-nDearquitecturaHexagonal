package com.hexagonal.tareas.aplicacion.casosdeuso;

import com.hexagonal.tareas.dominio.puertos.entrada.EliminarTareasCasoUso;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoTareasRepositorio;

public class EliminarTareasCasoUsoImplementacion implements EliminarTareasCasoUso {
    private final PuertoTareasRepositorio puertoTareasRepositorio;

    public EliminarTareasCasoUsoImplementacion(PuertoTareasRepositorio puertoTareasRepositorio) {
        this.puertoTareasRepositorio = puertoTareasRepositorio;
    }

    @Override
    public boolean borrarTareas(Long id) {
        return puertoTareasRepositorio.deleteById(id);
    }
}


