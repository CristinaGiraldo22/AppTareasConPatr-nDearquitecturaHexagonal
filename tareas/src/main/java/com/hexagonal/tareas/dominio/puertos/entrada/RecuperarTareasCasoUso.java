package com.hexagonal.tareas.dominio.puertos.entrada;

import com.hexagonal.tareas.dominio.modelos.Tareas;

import java.util.List;
import java.util.Optional;

public interface RecuperarTareasCasoUso {
    Optional<Tareas> obtenerTareas(Long id);
    List<Tareas> obtenerTareasTodas();
}
