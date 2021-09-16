package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         2. Crea una clase Contador con los métodos para incrementar y decrementar el contador. La clase contendrá un constructor por defecto,
         un constructor con parámetros, un constructor copia y los métodos getters y setters.
         */

        Scanner sc= new Scanner(System.in);

        //Utilizar el constructor por defecto ---------------------------
        Contador  contador1= new Contador();

        int n=0;
        System.out.println("Introduce valor para inicializar el contador");
        n =sc.nextInt();

        // asginar un valor al contador
        contador1.setCont(n);
        // incrementar el contador
        contador1.Incrementar();
        //Mostrar el valor actual
        System.out.println(contador1.getCont());
// con las dos siguientes lineas invocamos a la funcion incrementar realizando  dos incrementos mas al valor añadido
        contador1.Incrementar();
        contador1.Incrementar();
        //mostrar el valor actual
        System.out.println(contador1.getCont());

        // restar 1 al valor del contador
        contador1.decrementar();
        System.out.println(contador1.getCont());

        // crear un nuevo objeto Contador con valor inicial 10
        Contador contador2= new Contador(10);

        // incrementar y decrementar el contador2 y mostrar su valor
        contador2.Incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());

        //crear un objeto Contador utilizando el constructor copia, se crea el objeto contador3 como copia de contador2
        Contador contador3 = new Contador(contador2);

        //mostrar el valor de contador3
        System.out.println("En este vemos el valor inicial del objeto Contador2= "+contador3.getCont());
    }
}
