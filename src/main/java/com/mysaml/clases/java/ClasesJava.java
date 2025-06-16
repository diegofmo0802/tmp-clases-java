package com.mysaml.clases.java;
public class ClasesJava {
    public static void calcPares() {
        /*
            for (inicialisacion de variable; condicion; incremetar/decrementar) {}
        
            i++ es la abreviacion de sumar 1 a una variable
            i = i + 1
        */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // Tipos de dato y creación de variables
        int enteros = 5; // almacena numeros enteros_ 1, 2, 3
        double doubles = 1.52; // numeros con decimales 1.1, 1.2, 5.4
        String s = "Cadena de texto"; // almacena cadenas de texto
        
        System.out.println("Hello World!");
        
        calcPares();
    }
}
