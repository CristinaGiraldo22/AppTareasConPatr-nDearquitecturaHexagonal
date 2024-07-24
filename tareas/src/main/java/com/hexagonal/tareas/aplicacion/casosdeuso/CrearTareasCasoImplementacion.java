package com.hexagonal.tareas.aplicacion.casosdeuso;

import com.hexagonal.tareas.dominio.modelos.Tareas;
import com.hexagonal.tareas.dominio.puertos.entrada.CrearTareasCasoUso;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoTareasRepositorio;

public class CrearTareasCasoImplementacion implements CrearTareasCasoUso {
    private final PuertoTareasRepositorio  puertoTareasRepositorio;

    public CrearTareasCasoImplementacion(PuertoTareasRepositorio puertoTareasRepositorio) {
        this.puertoTareasRepositorio = puertoTareasRepositorio;
    }


    @Override
    public Tareas crearTareas(Tareas tareas) {
        return puertoTareasRepositorio.guardar(tareas);
    }
}
