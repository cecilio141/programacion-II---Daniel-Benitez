/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciaespacial;

import java.util.ArrayList;


/**
 *
 * @author Cecilio
 */
public class AgenciaEspacial {
    public String nombre;
    public ArrayList<Nave> listaNaves;

    public AgenciaEspacial(String nombre, ArrayList<Nave> listaNaves) {
        this.nombre = nombre;
        this.listaNaves = listaNaves;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
     public void agregarNave(Nave nave){
            if(listaNaves.contains(nave)){
                throw new IllegalArgumentException("Ya existe una nave con esos datos");
            }else{
                listaNaves.add(nave);
            }
        }
     
     public void mostrarNaves(ArrayList<Nave> listaNaves){
         if (listaNaves.isEmpty()){
             System.out.println("La lista de naves esta vacia");
         }else{
            for (Nave n : listaNaves){
                System.out.println(n);
            }
         }
     }
     
     public void iniciarExploracion(ArrayList<Nave> listaNaves){
         if (listaNaves.isEmpty()){
             System.out.println("La lista de naves esta vacia");
         }else{
             for (Nave n: listaNaves){
                 n.explorar();
             }
         }
     }
     
     
    }
   
