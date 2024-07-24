package com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.controller;


import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.factory.HistoriaClinicaFactory;
import com.crearHistoriasClinicas.historiasClinicasConAbtracFactory.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoriaClinicaController {

    @Autowired
    private HistoriaClinicaFactory pediatricaHistoriaClinicaFactory;

    @Autowired
    private HistoriaClinicaFactory adultaHistoriaClinicaFactory;

    @Autowired
    private HistoriaClinicaFactory geriatricaHistoriaClinicaFactory;

    @GetMapping("/historiaClinica")
    public HistoriaClinica getHistoriaClinica(@RequestParam String tipo) {
        HistoriaClinicaFactory factory;
        switch (tipo) {
            case "pediatrica":
                factory = pediatricaHistoriaClinicaFactory;
                break;
            case "adulta":
                factory = adultaHistoriaClinicaFactory;
                break;
            case "geriatrica":
                factory = geriatricaHistoriaClinicaFactory;
                break;
            default:
                throw new IllegalArgumentException("Tipo de historia clínica no soportado");
        }

        return switch (tipo) {
            case "pediatrica" -> new PediatricaHistoriaClinica(factory);
            case "adulta" -> new AdultaHistoriaClinica(factory);
            case "geriatrica" -> new GeriatricaHistoriaClinica(factory);
            default -> throw new IllegalArgumentException("Tipo de historia clínica no soportado");
        };
    }
}