package com.mycompany.agenciaespacial;


import com.mycompany.agenciaespacial.Nave;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cecilio
 */
public class NaveExploracion extends Nave {
    
    public enum Mision {CARTOGRAFIA, INVESTIGACION, CONTACTO};
    private Mision mision;
    
    public NaveExploracion(String tipo, String nombre, int anio, int capacidadPersonas, Mision mision){
        super(tipo, nombre, anio, capacidadPersonas);
        this.mision = mision;
    }
    
    @Override
    public void explorar(){
        System.out.println("La nave de exploracion: "+this.nombre+ " lanzada en el anio: "+this.anio+", esta realizando la mision de "+this.mision);
    }
    
    @Override
    public String toString(){
       return  "Nombre: "+ this.nombre + ", Capacidad de tripulacion: "+this.capacidadPersonas + ", Anio de lanzamiento: " + this.anio+ ", Tipo de mision: "+this.mision;
    }
}
