package com.hexagonal.tareas.infraestructura.configuracion;

import com.hexagonal.tareas.aplicacion.casosdeuso.*;
import com.hexagonal.tareas.aplicacion.servicios.ServicioTareas;
 //
import com.hexagonal.tareas.dominio.puertos.entrada.obtenerInformacionTareasAdicionalesCasosUso;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoServicioExterno;
import com.hexagonal.tareas.dominio.puertos.salida.PuertoTareasRepositorio;
import com.hexagonal.tareas.infraestructura.adaptadores.AdaptadorServicioExterno;
import com.hexagonal.tareas.infraestructura.repositorios.JpaTareaAdaptadorRepositorio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionAplicacion {

    @Bean
    public ServicioTareas servicioTareas(PuertoTareasRepositorio puertoTareasRepositorio, ObtenerTareasCasoUsoImplementacion obtenerInformacionTareasAdicionalesCasosUso ){
        return new ServicioTareas(
                new CrearTareasCasoImplementacion(puertoTareasRepositorio),
                new RecuperarTareasCasosUsoImplementacion(puertoTareasRepositorio),
                new ActualizarTareasCasoUsoImplementacion(puertoTareasRepositorio),
                new EliminarTareasCasoUsoImplementacion(puertoTareasRepositorio),
                obtenerInformacionTareasAdicionalesCasosUso
        );

    }

    @Bean
    public PuertoTareasRepositorio puertoTareasRepositorio(JpaTareaAdaptadorRepositorio jpaTareasAdaptadorRepositorio) {
        return jpaTareasAdaptadorRepositorio;
    }

    @Bean
    public ObtenerTareasCasoUsoImplementacion obtenerInformacionTareasAdicionalesCasosUso(PuertoServicioExterno puertoServicioExterno ){
       return new ObtenerTareasCasoUsoImplementacion(puertoServicioExterno);
    }

    @Bean
    public PuertoServicioExterno puertoServicioExterno(){
        return new AdaptadorServicioExterno();
    }

}
