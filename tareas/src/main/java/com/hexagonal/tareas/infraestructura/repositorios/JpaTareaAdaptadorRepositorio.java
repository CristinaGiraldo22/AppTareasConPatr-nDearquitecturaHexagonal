package com.hexagonal.tareas.infraestructura.repositorios;

import com.hexagonal.tareas.dominio.modelos.Tareas;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoTareasRepositorio;
import com.hexagonal.tareas.infraestructura.entidades.EntidadTareas;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaTareaAdaptadorRepositorio implements PuertoTareasRepositorio {

    private final JpaTareaRepositorio jpaTareaRepositorio;

    public JpaTareaAdaptadorRepositorio(JpaTareaRepositorio jpaTareaRepositor) {
        this.jpaTareaRepositorio = jpaTareaRepositor;
    }

    @Override
    public Tareas guardar(Tareas tareas) {
        EntidadTareas entidadTareas = EntidadTareas.fromDomainModel(tareas);
        EntidadTareas guardarTareasEntida = jpaTareaRepositorio.save(entidadTareas);
        return guardarTareasEntida.toDomainModel();
    }

    @Override
    public Optional<Tareas> findById(Long id) {
        return jpaTareaRepositorio.findById(id).map(EntidadTareas :: toDomainModel);
    }

    @Override
    public List<Tareas> findAll() {
        return jpaTareaRepositorio.findAll().stream().map(EntidadTareas::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<Tareas> update(Tareas tareas) {
        if(jpaTareaRepositorio.existsById(tareas.getId())){
            EntidadTareas entidadTareas = EntidadTareas.fromDomainModel(tareas);
            EntidadTareas updateTareasEntidad =jpaTareaRepositorio.save(entidadTareas);
            return Optional.of(updateTareasEntidad.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaTareaRepositorio.existsById(id)){
            jpaTareaRepositorio.deleteById(id);
            return true;
        }

        return false;
    }
}
