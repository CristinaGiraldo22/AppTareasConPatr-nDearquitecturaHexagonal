package com.hexagonal.tareas.dominio.modelos;

public class InformacionTareasAdicionales {
    private final Long userId;
    private final String nombreCompleto;
    private final String correo;
    public InformacionTareasAdicionales(Long userId, String nombreCompleto, String correo) {
        this.userId = userId;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
    }

    public Long getUserId() {
        return userId;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }
}
