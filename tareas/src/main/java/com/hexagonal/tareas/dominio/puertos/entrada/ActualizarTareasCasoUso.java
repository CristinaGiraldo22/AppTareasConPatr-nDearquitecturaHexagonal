package com.hexagonal.tareas.dominio.puertos.entrada;

import com.hexagonal.tareas.dominio.modelos.Tareas;

import java.util.Optional;

public interface ActualizarTareasCasoUso {
    Optional<Tareas> actualizarTareas(Long id, Tareas actualizarTareas);

}
