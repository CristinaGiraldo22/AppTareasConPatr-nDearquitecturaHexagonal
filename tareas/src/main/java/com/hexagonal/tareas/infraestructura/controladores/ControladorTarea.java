package com.hexagonal.tareas.infraestructura.controladores;

import com.hexagonal.tareas.aplicacion.servicios.ServicioTareas;
import com.hexagonal.tareas.dominio.modelos.InformacionTareasAdicionales;
import com.hexagonal.tareas.dominio.modelos.Tareas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class ControladorTarea {


    private final ServicioTareas servicioTareas;

    public ControladorTarea(ServicioTareas servicioTareas) {
        this.servicioTareas = servicioTareas;
    }

    @PostMapping
    public ResponseEntity<Tareas> crearTareas(@RequestBody Tareas tareas) {
        Tareas crearTareas = servicioTareas.crearTareas(tareas);
        return new  ResponseEntity<>(crearTareas, HttpStatus.CREATED);
    }

    @GetMapping("/{tareasId}")
    public ResponseEntity<Tareas> obtenerTareas(@PathVariable Long tareasId) {
        return servicioTareas.obtenerTareas(tareasId)
               .map(tareas -> new ResponseEntity<>(tareas, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity <List<Tareas>> obtenerTareasTodas(){
        List<Tareas> tareas = servicioTareas.obtenerTareasTodas();
        return new ResponseEntity<>(tareas, HttpStatus.OK);
    }

    @PutMapping("/{tareasId}")
    public ResponseEntity<Tareas> actualizarTareas(@PathVariable Long tareasId, @RequestBody Tareas actualizarTareas){
        return servicioTareas.actualizarTareas(tareasId,actualizarTareas)
                .map(tareas -> new ResponseEntity<>(tareas, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{tareasId}")
    public ResponseEntity<Void> borrarTareas(@PathVariable Long tareasId) {

        if (servicioTareas.borrarTareas(tareasId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{tareasId}/tareasAdicionales")
    public ResponseEntity<InformacionTareasAdicionales> obtenerTareasAdicionales(@PathVariable Long tareasId) {
        InformacionTareasAdicionales informacionTareas = servicioTareas.obtenerTareasAdicionales(tareasId);
        return new ResponseEntity<>(informacionTareas, HttpStatus.OK);
    }
}
