package com.CodeGymPractice.CodeGym.producto;

public class Producto {
    String nombre;
    String tipo;
    int id;
   public Producto(){
        this.nombre = "VinitoMexicano";
        this.tipo = "Bebida";
        this.id = 1234;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




}
