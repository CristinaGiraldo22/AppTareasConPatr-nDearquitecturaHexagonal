package com.hexagonal.tareas.dominio.puertos.entrada;

import com.hexagonal.tareas.dominio.modelos.Tareas;

public interface CrearTareasCasoUso {
    Tareas crearTareas(Tareas tareas);
}
