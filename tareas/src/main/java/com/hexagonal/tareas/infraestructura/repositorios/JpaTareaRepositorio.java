package com.hexagonal.tareas.infraestructura.repositorios;


import com.hexagonal.tareas.infraestructura.entidades.EntidadTareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTareaRepositorio extends JpaRepository<EntidadTareas, Long> {
}
