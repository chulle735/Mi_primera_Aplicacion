package com.utp.miprimeraaplicacion;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping("/listar")
    public String listar() {
        return "Aquí se listarán los productos del negocio.";
    }

    @PostMapping("/crear")
    public String crear() {
        return "Producto creado correctamente (simulado).";
    }

    @GetMapping("/{id}")
    public String obtenerPorId(@PathVariable int id) {
        return "Detalle del producto con id: " + id;
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam String nombre,
                         @RequestParam(required = false, defaultValue = "10") double precioMax) {
        return "Buscando '" + nombre + "' con precio máximo de S/ " + precioMax;
    }

    @GetMapping("/json")
    public List<Producto> listarJson() {
        return Arrays.asList(
                new Producto(1, "Café americano", 8.0, "Bebidas"),
                new Producto(2, "Capuchino", 12.5, "Bebidas"),
                new Producto(3, "Cheesecake", 15.0, "Postres"),
                new Producto(4, "Sándwich club", 18.5, "Comidas")
        );
    }

}
