package com.hexagonal.tareas.dominio.puertos.salida;

import com.hexagonal.tareas.dominio.modelos.Tareas;

import java.util.List;
import java.util.Optional;

public interface PuertoTareasRepositorio {
    Tareas guardar(Tareas tareas);
    Optional<Tareas> findById(Long id);
    List<Tareas> findAll();
    Optional<Tareas> update(Tareas tareas);
    boolean deleteById(Long id);
}
