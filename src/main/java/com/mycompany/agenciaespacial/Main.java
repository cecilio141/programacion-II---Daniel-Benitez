    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

    package com.mycompany.agenciaespacial;

    import java.util.ArrayList;
import java.util.InputMismatchException;
    import java.util.Scanner;

    /**
     *
     * @author Cecilio
     */
    public class Main {

        public static void main(String[] args) {
            ArrayList<Nave> listaNaves = new ArrayList<>();
            AgenciaEspacial agencia = new AgenciaEspacial("Pepe", listaNaves);
            Nave nave = null;
            
            int opcion = 0;
            Scanner teclado = new Scanner(System.in);


            do {
                System.out.println("\nBienvenido a la agencia espacial, ingrese una opcion: ");
                System.out.println("1)_Agregar nave");
                System.out.println("2)_Mostrar naves");
                System.out.println("3)_Iniciar exploracion");
                System.out.println("0)_ SALIR\n");
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion){
                    case 1 ->{
                        String tipoString = "";
                        
                        System.out.println("Ingrese el tipo de nave:\n1)_Carguero,\n2)_Exploracion\n3)_Estelar");
                        boolean valido = false;
                        int tipo = 0;
                        do{
                            try {
                                tipo = teclado.nextInt();
                                teclado.nextLine();
                                if(tipo <1 || tipo >3){
                                    System.out.println("Ingrese un valor valido");
                                }else{
                                    switch (tipo){
                                        case 1->{
                                            tipoString = "Carguero";
                                        }
                                        case 2->{
                                            tipoString = "Estelar";
                                        }
                                        case 3->{
                                            tipoString = "Exploracion";
                                        }
                                    }
                                    valido = true;
                                }

                            } catch (Exception e) {
                                System.out.println("Error, ingrese un numero valido en digitos");
                                teclado.nextLine();
                            }
                        }while(valido == false);
                        System.out.println("Ingrese el nombre de la nave: ");
                        String nombre = teclado.nextLine();
                        System.out.println("Ingrese el anio de lanzamiento: ");
                        boolean check = false;
                        int anio = 0;
                        do {
                            try {
                                anio = teclado.nextInt();
                                teclado.nextLine();
                                    if(anio < 0){
                                        System.out.println("Ingrese un anio de lanzamiento valido");                                        
                                    }else{
                                        check = true;
                                    }
                            } catch (Exception e) {
                                System.out.println("Error, ingrese una fecha valida en digitos");       
                                teclado.nextLine();
                            }
                        } while (check == false);
                        System.out.println("Ingrese la capacidad de tripulantes: ");
                        boolean checkeo = false;
                        int capacidadTripulantes = 0;
                        do { 
                            try {
                                capacidadTripulantes = teclado.nextInt();
                                teclado.nextLine();
                                if (capacidadTripulantes > 0){
                                    checkeo = true;
                                }else{
                                    System.out.println("Debe ingresar una cantidad de tripulantes valido");
                                }
                            } catch (Exception e) {
                                System.out.println("Error, ingrese la cantidad de tripulantes en digitos");
                                teclado.nextLine();
                            }                            
                        } while (checkeo == false);
                        double toneladas = NaveCarguero.getCAPACIDAD_MAXIMA();
                        boolean chekeoToneladas = false;
                        switch(tipo){
                            case 1->{              
                                do {                                   
                                    try {
                                        System.out.println("Ingrese la capacidad de toneladas");
                                        toneladas = teclado.nextDouble();
                                        teclado.nextLine();
                                        nave = new NaveCarguero(tipoString, nombre, anio, capacidadTripulantes, toneladas);  
                                        agencia.agregarNave(nave);
                                        chekeoToneladas = true;
                                        
                                    } catch (IllegalArgumentException e) {
                                        System.out.println("A ingresado un valor erroneo, la capacidad minima es: "+NaveCarguero.getCAPACIDAD_MINIMA()+" y la capacidad maxima: "+NaveCarguero.getCAPACIDAD_MAXIMA());
                                        teclado.nextLine();
                                    } catch(java.util.InputMismatchException e){
                                        System.out.println("Ingrese un dato valido de toneladas (en digitos)");
                                        teclado.nextLine();
                                    }
                                    
                                } while (chekeoToneladas == false);
                                
                            }
                            case 2->{
                                int option = 0;
                                boolean validacion = false;
                                do {
                                    try {
                                        System.out.println("\nElija el tipo de mision:\n1)_Cartografia\n2)_Investigacion\n3)_Contacto\n");
                                        option = teclado.nextInt();
                                        teclado.nextLine();
                                        if(option < 1 || option > 3){
                                            System.out.println("\nIngrese un valor dentro del rango dado (1,2,3)\n");
                                            teclado.nextLine();
                                        } else {
                                            validacion = true;
                                            switch (option){
                                                case 1-> {
                                                nave = new NaveExploracion(tipoString, nombre, anio, capacidadTripulantes, NaveExploracion.Mision.CARTOGRAFIA);
                                                }
                                                case 2-> {
                                                    nave = new NaveExploracion(tipoString, nombre, anio, capacidadTripulantes, NaveExploracion.Mision.INVESTIGACION);
                                                }
                                                case 3->{
                                                    nave = new NaveExploracion(tipoString, nombre, anio, capacidadTripulantes, NaveExploracion.Mision.CONTACTO);
                                                }
                                            }
                                            agencia.agregarNave(nave);
                                            
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Error, ingrese un numero en digitos");
                                        teclado.nextLine();
                                    }
                                    catch (IllegalArgumentException e){
                                        System.out.println("Error, ya existe una nave con esos datos");
                                        teclado.nextLine();
                                    }
                                } while(validacion == false); 
                                

                                
                            }
                            case 3->{
                                int cantidadPasajeros = 0;
                                boolean validacion = false;
                                do {     
                                    System.out.println("Ingrese la cantidad de pasajeros abordo");
                                    try {
                                        cantidadPasajeros = teclado.nextInt();
                                        teclado.nextLine();
                                        nave = new NaveEstelar(tipoString, nombre, anio, capacidadTripulantes, cantidadPasajeros);
                                        agencia.agregarNave(nave);
                                        validacion = true;
                                    }catch(IllegalArgumentException e){
                                        System.out.println("La nave ya existe");
                                        teclado.nextLine();
                                        break;

                                    }
                                    catch(IndexOutOfBoundsException e){
                                        System.out.println("A ingresado una cantidad fuera de los parametros");
                                    }
                                    
                                    catch (InputMismatchException e) {
                                        System.out.println("Ingrese la cantidad de pasajeros en digitos");
                                        teclado.nextLine();
                                    }
                                } while (validacion == false);
                                
                            }

                        }

                        

                    }
                    case 2->{          
                     agencia.mostrarNaves(listaNaves);
                    }
                    case 3->{
                        agencia.iniciarExploracion(listaNaves);
                    }
                }
                

            } while (opcion != 0);



        }
    }

