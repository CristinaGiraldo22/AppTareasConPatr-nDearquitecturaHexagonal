package com.hexagonal.tareas.infraestructura.entidades;

import com.hexagonal.tareas.dominio.modelos.Tareas;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class EntidadTareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaLocal;
    private boolean completado;

    public EntidadTareas() {
    }

    public EntidadTareas(Long id, String titulo, String descripcion, LocalDateTime creacionFecha, boolean completado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLocal = creacionFecha;
        this.completado = completado;
    }

    public static EntidadTareas fromDomainModel(Tareas tareas) {
        return new EntidadTareas(tareas.getId(), tareas.getTitulo(), tareas.getDescripcion(), tareas.getFechaLocal(), tareas.isCompletada());
    }


    public Tareas toDomainModel() {
        return new Tareas(id, titulo, descripcion, fechaLocal, completado);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaLocal() {
        return fechaLocal;
    }

    public void setFechaLocal(LocalDateTime fechaLocal) {
        this.fechaLocal = fechaLocal;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
