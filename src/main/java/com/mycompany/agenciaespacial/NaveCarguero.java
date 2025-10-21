package com.mycompany.agenciaespacial;


import com.mycompany.agenciaespacial.Nave;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cecilio
 */
public class NaveCarguero extends Nave {
    
    private double capacidadToneladas;
    
    private static final double CAPACIDAD_MINIMA = 100;
    private static final double CAPACIDAD_MAXIMA = 500;
    
    
    public NaveCarguero(String tipo, String nombre, int anio, int capacidadPersonas, double capacidadToneladas){
        super(tipo, nombre, anio, capacidadPersonas);
        setCapacidadToneladas(capacidadToneladas);
}


    public void setCapacidadToneladas(double capacidadToneladas) {
                
                if(capacidadToneladas < CAPACIDAD_MINIMA || capacidadToneladas > CAPACIDAD_MAXIMA){
                    throw new IllegalArgumentException("A ingresado una capacidad erronea, la capacidad minima es: "+CAPACIDAD_MINIMA+", y la capacidad maxima es: "+CAPACIDAD_MAXIMA+"\nIntente nuevamente");
                }else{
                    this.capacidadToneladas = capacidadToneladas;
                }
        
    }

    @Override
    public void explorar() {
        System.out.println("La nave: "+this.nombre+" lanzada en el anio: "+this.anio+" esta realizando el cargamento de las "+this.capacidadToneladas+" toneladas");
    }
    @Override
    public String toString(){
       return  "Nombre: "+ this.nombre + ", Capacidad de tripulacion: "+this.capacidadPersonas + ", Anio de lanzamiento: " + this.anio+ ", Capacidad de toneladas: "+this.capacidadToneladas;
    
    }

    public static double getCAPACIDAD_MAXIMA() {
        return CAPACIDAD_MAXIMA;
    }
    public static double getCAPACIDAD_MINIMA() {
        return CAPACIDAD_MINIMA;
    }
}
    
    
    
    

