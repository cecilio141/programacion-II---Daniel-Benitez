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
public class NaveEstelar extends Nave {

    private int pasajeros;
    
    public NaveEstelar(String tipo, String nombre, int anio, int tripulacion, int pasajeros ){
        super(tipo, nombre, anio, tripulacion);
        setPasajeros(pasajeros);
    }

    public void setPasajeros(int pasajeros) {
        if(pasajeros<0){
            throw new IndexOutOfBoundsException("A ingresado una capacidad erronea de pasajeros");
        }else{
            this.pasajeros = pasajeros;
        }
    }
    
    
    
    
    
    @Override
    public void explorar(){
        System.out.println("La nave estelar: "+this.nombre+" lanzada en el anio: "+this.anio+", no puedo realizar una exploracion, ya que solo transporto pasajeros");
    }


    @Override
    public String toString(){
       return  "Nombre: "+ this.nombre + ", Capacidad de tripulacion: "+this.capacidadPersonas + ", Anio de lanzamiento: "+this.anio+" La cantidad de pasajeros abordo es de: "+this.pasajeros;
    }
    

}
