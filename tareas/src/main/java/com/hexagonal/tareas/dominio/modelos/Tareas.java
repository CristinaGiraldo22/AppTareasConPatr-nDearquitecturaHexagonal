package com.hexagonal.tareas.dominio.modelos;

import java.time.LocalDateTime;

public class Tareas {
    private Long id;
    private String titulo;
    private String descripcion;
    private LocalDateTime fechaLocal;
    private boolean completada;

    public Tareas(Long id, String titulo, String descripcion, LocalDateTime fechaLocal, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLocal = fechaLocal;
        this.completada = completada;
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

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
