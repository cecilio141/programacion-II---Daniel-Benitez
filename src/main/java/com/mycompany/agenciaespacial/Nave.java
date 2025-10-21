package com.mycompany.agenciaespacial;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cecilio
 */
public abstract class Nave {
    protected String tipo;
    protected String nombre;
    protected int anio;
    protected int capacidadPersonas;

    public Nave(String tipo, String nombre, int anio, int capacidadPersonas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anio;
        this.capacidadPersonas = capacidadPersonas;
    }

    public abstract void explorar();
    
    
    @Override
    public String toString(){
        return "Tipo de nave: "+ this.tipo +", nombre: "+ this.nombre +", anio";
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return this.nombre.equals(nave.nombre) && this.anio == nave.anio;
    }

      @Override
      public int hashCode() {
        return Objects.hash(nombre, tipo, anio);
}
      
    
    
}
