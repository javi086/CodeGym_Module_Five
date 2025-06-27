package com.CodeGymPractice.CodeGym.controller;

import com.CodeGymPractice.CodeGym.producto.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/productos")
public class ProductoController {

    @GetMapping("/saludar")
    public String hola(){
        return  "Hola";
    }


    @GetMapping("/obtenerProductoPorNombre/{productoNombre}")
    public Producto getProducto(@PathVariable(name = "productoNombre") String nombre){
        Producto productoPrueba = new Producto();

        if(nombre.isEmpty()){
            System.out.println("El nombre esta vacio o no coincide");
        }else if(!nombre.equals(productoPrueba.getNombre())){
            System.out.println("El nombre del producto no coincide");
            productoPrueba.setNombre(nombre);
            productoPrueba.setTipo("Desconocido");
            productoPrueba.setId(0000);
        }else{
            System.out.println("Producto encontrado");
        }
        return productoPrueba;
    }

    @PostMapping()
    public Producto crearProducto(@RequestBody Producto producto){
        System.out.println("Producto creado");
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre(producto.getNombre());
        nuevoProducto.setTipo(producto.getTipo());
        nuevoProducto.setId(producto.getId());
        System.out.println("Informacion del nuevo producto");
        System.out.println(producto.getNombre());
        System.out.println(producto.getTipo());
        System.out.println(producto.getId());
        return  producto;
    }


}