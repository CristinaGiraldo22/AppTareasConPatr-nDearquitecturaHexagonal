package com.hexagonal.tareas.aplicacion.servicios;

import com.hexagonal.tareas.dominio.modelos.InformacionTareasAdicionales;
import com.hexagonal.tareas.dominio.modelos.Tareas;
import com.hexagonal.tareas.dominio.puertos.entrada.*;

import java.util.List;
import java.util.Optional;

public class ServicioTareas implements CrearTareasCasoUso, RecuperarTareasCasoUso, ActualizarTareasCasoUso, EliminarTareasCasoUso, obtenerInformacionTareasAdicionalesCasosUso {
    private final CrearTareasCasoUso crearTareasCasoUso;
    private final RecuperarTareasCasoUso recuperarTareasCasoUso;
    private final ActualizarTareasCasoUso actualizarTareasCasoUso;
    private final EliminarTareasCasoUso eliminarTareasCasoUso;
    private final obtenerInformacionTareasAdicionalesCasosUso obtenerInformacionTareasAdicionalesCasoUso;

    public ServicioTareas(CrearTareasCasoUso crearTareasCasoUso, RecuperarTareasCasoUso recuperarTareasCasoUso, ActualizarTareasCasoUso actualizarTareasCasoUso, EliminarTareasCasoUso eliminarTareasCasoUso, obtenerInformacionTareasAdicionalesCasosUso obtenerInformacionTareasAdicionalesCasoUso) {
        this.crearTareasCasoUso = crearTareasCasoUso;
        this.recuperarTareasCasoUso = recuperarTareasCasoUso;
        this.actualizarTareasCasoUso = actualizarTareasCasoUso;
        this.eliminarTareasCasoUso = eliminarTareasCasoUso;
        this.obtenerInformacionTareasAdicionalesCasoUso = obtenerInformacionTareasAdicionalesCasoUso;
    }

    @Override
    public Optional<Tareas> actualizarTareas(Long id, Tareas actualizarTareas) {
        return actualizarTareasCasoUso.actualizarTareas(id, actualizarTareas);
    }

    @Override
    public Tareas crearTareas(Tareas tareas) {
        return crearTareasCasoUso.crearTareas(tareas);
    }

    @Override
    public boolean borrarTareas(Long id) {
        return eliminarTareasCasoUso.borrarTareas(id);
    }

    @Override
    public Optional<Tareas> obtenerTareas(Long id) {
        return recuperarTareasCasoUso.obtenerTareas(id);
    }

    @Override
    public List<Tareas> obtenerTareasTodas() {
        return recuperarTareasCasoUso.obtenerTareasTodas();
    }

    @Override
    public InformacionTareasAdicionales obtenerTareasAdicionales(Long id) {
        return obtenerInformacionTareasAdicionalesCasoUso.obtenerTareasAdicionales(id);
    }
}
