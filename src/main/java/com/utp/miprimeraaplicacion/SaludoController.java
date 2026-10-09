package com.utp.miprimeraaplicacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola! Soy Elvis y este es mi proyecto con Spring Boot.";
    }

    @GetMapping("/acerca-de")
    public String acercaDe() {
        return "Proyecto del curso Marcos de Desarrollo Web. "
                + "Negocio ficticio: Cafetería El Buen Sabor.";
    }

}
