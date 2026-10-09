package com.utp.miprimeraaplicacion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/inicio")
public class InicioController {

    @GetMapping
    public String mostrarInicio(Model model) {
        model.addAttribute("nombreNegocio", "Cafetería El Buen Sabor");
        model.addAttribute("mensaje", "¡Bienvenido a nuestra página!");
        return "inicio"; // busca templates/inicio.html
    }

    @GetMapping("/vista")
    public String mostrarProductos(Model model) {
        List<Producto> productos = Arrays.asList(
                new Producto(1, "Café americano", 8.0, "Bebidas"),
                new Producto(2, "Capuchino", 12.5, "Bebidas"),
                new Producto(3, "Cheesecake", 15.0, "Postres"),
                new Producto(4, "Sándwich club", 18.5, "Comidas"),
                new Producto(5, "Jugo de naranja", 9.5, "Bebidas")
        );
        model.addAttribute("productos", productos);
        return "productos";
    }

}
