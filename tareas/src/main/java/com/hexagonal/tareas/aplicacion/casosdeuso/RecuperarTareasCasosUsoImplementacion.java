package com.hexagonal.tareas.aplicacion.casosdeuso;

import com.hexagonal.tareas.dominio.modelos.Tareas;
import com.hexagonal.tareas.dominio.puertos.entrada.RecuperarTareasCasoUso;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoTareasRepositorio;

import java.util.List;
import java.util.Optional;

public class RecuperarTareasCasosUsoImplementacion implements RecuperarTareasCasoUso {
    private final PuertoTareasRepositorio puertoTareasRepositorio;

    public RecuperarTareasCasosUsoImplementacion(PuertoTareasRepositorio puertoTareasRepositorio) {
        this.puertoTareasRepositorio = puertoTareasRepositorio;
    }

    @Override
    public Optional<Tareas> obtenerTareas(Long id) {
        return puertoTareasRepositorio.findById(id);
    }

    @Override
    public List<Tareas> obtenerTareasTodas() {
        return puertoTareasRepositorio.findAll();
    }
}
