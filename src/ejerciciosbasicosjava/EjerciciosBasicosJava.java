/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author Javia
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
        
        if(finDeSemana){
            return true;
        }
        
        if(numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        
        return false;
    }
    
    /**
     * Multa
     * @param velocidad
     * @param birthday
     * @return 
     */
    
    public int multa (int velocidad, boolean birthday){
        
        if(birthday){
            velocidad = velocidad - 5; //velocidad -=5;
            
        }
        if(velocidad<= 60){
            return 0;
        }
        if(velocidad >=61 && velocidad <=80){
            return 1;
        }
        return 2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un objeto del tipo de la clase en la que estamos
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        //Ardillas
        System.out.println("Ejercicio 01 ardillas:");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        System.out.println("");
        //Multas
        System.out.println("Ejercicio 02 Multas:");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));
        System.out.println("");
        //
    }
    
}
