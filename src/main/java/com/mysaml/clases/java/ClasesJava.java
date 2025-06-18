package com.mysaml.clases.java;

public class ClasesJava {
    static String[] ids = new String[] {"p1", "p2", "p3", "p4"};
    static int count = 0;
    public static String genID() {
        count++;
        return "p" + count;
    }
    public static boolean existID(String id) {
        if (id == null) return false;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id)) {
                return true;
            }
        }
        return false;
    }
    public static String newID() {
        /*
            Diferencia de while y do while
            el bloque del codigo del do while se ejecutara siempre
            almenos 1 vez aunque la condicion no se cumpla
            en el caso del while el bloque de codigo solo se ejecutara
            si la condicion se cumple, de lo contrario jamas se ejecutara
        */
        /*
            String id = genID();
            while (existID(id)){
                id = genID();
            };
        */
        String id;
        do {
            id = genID();
            System.out.println("newx id to test: " + id);
        } while (existID(id));
        return id;
    }
    /*n representa cantidad de pares que se quiere mostrar */
    /*Saber cauntos pares se han mostrado hasta ahora */
    /*Tener contador para ver cuantos se han probado */
    /*Ejecutar codigo hasta que se muestre la cantidad de n requeridas */
    public static void paresWhile(int n) {
        int mostrados = 0;
        int contador = 1;
        while (mostrados <= n) { 
            int modulo = contador % 2;
            if(modulo == 0){
                mostrados ++;
                System.out.println(contador);
            }
            contador ++;         
        }
    }
    public static void calcPares() {
        /*
            for (inicialisacion de variable; condicion; incremetar/decrementar) {}
        
            i++ es la abreviacion de sumar 1 a una variable
            i = i + 1
        */
        for (int i = 1; i <= 10; i++) {
            int modulo = i % 2;
            if(modulo == 0){
                System.out.println("el numero " + i + "es par");
            } else {
                System.out.println("el numero " + i + "no es par");
            }
        }
        int x = 4;
        /*
            operaciones condicionales
            igualdad ==
            desigualdad !=
            mayor que >
            mayor o igual que >=
            menor que <
            menor o igual que <=
        
            operaciones aritmeticas
            suma +
            resta -
            multiplicacion *
            divicion /
            modulo %
        */
        if (x ==  4) {
            // si es verdad
        } else {
            // si es falso
        }
    }
    public static void main(String[] args) {
        // Tipos de dato y creación de variables
        // int enteros = 5; // almacena numeros enteros_ 1, 2, 3
        // double doubles = 1.52; // numeros con decimales 1.1, 1.2, 5.4
        // String s = "Cadena de texto"; // almacena cadenas de texto
        
        System.out.println("Hello World!");
        
        // calcPares();
        paresWhile(15);
    }
}
