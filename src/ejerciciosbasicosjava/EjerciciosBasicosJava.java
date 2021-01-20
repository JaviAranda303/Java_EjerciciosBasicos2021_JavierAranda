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
    
    public boolean numeroVanidoso (int n){
        return(n % 11 == 1 || n % 11 == 0);
        
    }
    
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        if (matinal && madre){
            return true;
        }
        if (dormido){
            return false;
        }
        return true;
    }
    
    public boolean menor10(int a, int b, int c){
        if(a - b == 10 || a - c == 10 || b - c == 10){
            return true;
        }
        if(a - b == -10 || a - c == -10 || b - c == -10){
            return true;
        }
        return false;
    }
    
    public boolean digitioIgual (int n, int m){
        int n1 = n/10;
        int n2 = n%10;
        int m1 = m/10;
        int m2 = m%10;
        
        if (n1 == m1 || n2 == m1 || n1 == m2 || n2 == m2){
            return true;
        }
        
        return false;
    }
    
    public boolean multiploMultiple(int n){
        if(n % 3 == 0 && n % 5 == 0){
            return false;
        }
        if(n % 3 == 0){
            return true;
        }
        if(n % 5 == 0){
            return true;
        }
        
        
        return false;
    }
    
    public boolean menos20(int n){
        if ((n+1) % 20 == 0 || (n+2) % 20 == 0){
            return true;
        }
        return false;
    }
    
    public int ticketRojo(int x, int y, int n){
        if (x == 2 && y == 2 && n == 2){
            return 10;
        }
        if (x == y && y == n){
            return 5;
        }
        if (x != y && x!= n){
            return 1;
        } else {
            return 0;
        }
    }
    
    public int dados(int a, int b, boolean sinDobles){
        int c = a + b;
        int c1 = c + 1;
        
        if (a == b){
            if(sinDobles == true){
                return c1;
            }
        }
        return c;
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
        //Numero Vanidoso
        System.out.println(ejercicio.numeroVanidoso(22));
        System.out.println(ejercicio.numeroVanidoso(23));
        System.out.println(ejercicio.numeroVanidoso(24));
        System.out.println("");
        //Suena tu movil
        System.out.println(ejercicio.contesta(false, false, false));
        System.out.println(ejercicio.contesta(false, false, true));
        System.out.println(ejercicio.contesta(true, false, true));
        System.out.println("");
        //Diferencia de 10
        System.out.println(ejercicio.menor10(1, 7, 11));
        System.out.println(ejercicio.menor10(1, 7, 10));
        System.out.println(ejercicio.menor10(11, 1, 7));
        System.out.println("");
        //Un 2 en ambos numeros
        System.out.println(ejercicio.digitioIgual(12, 23));
        System.out.println(ejercicio.digitioIgual(12, 43));
        System.out.println(ejercicio.digitioIgual(12, 44));
        System.out.println("");
        //MultiploMultiple
        System.out.println(ejercicio.multiploMultiple(3));
        System.out.println(ejercicio.multiploMultiple(10));
        System.out.println(ejercicio.multiploMultiple(15));
        System.out.println("");
        //Menor20
        System.out.println(ejercicio.menos20(18));
        System.out.println(ejercicio.menos20(19));
        System.out.println(ejercicio.menos20(20));
        System.out.println("");
        //TicketRojo
        System.out.println(ejercicio.ticketRojo(2, 2, 2));
        System.out.println(ejercicio.ticketRojo(2, 2, 2));
        System.out.println(ejercicio.ticketRojo(2, 2, 2));
        System.out.println("");
        //Dados
        System.out.println(ejercicio.dados(2, 3, true));
        System.out.println(ejercicio.dados(3, 3, true));
        System.out.println(ejercicio.dados(3, 3, false));
        System.out.println(ejercicio.dados(6, 6, true));
        System.out.println("");
    }
    
}
