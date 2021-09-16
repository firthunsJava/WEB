package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Leer 10 números enteros y guardarlos
         * en un array. Calcular la media de los
         * que estén en las posiciones pares.
         */
        int[] numeros= new int[10];
        int contanumero=0;
        double sumapar=0;
        int i=0;
        Scanner sc=new Scanner(System.in);
        // Ahora se va a proceder a llenar el array con los numeros solicitados
        System.out.println("ingresa 10 numeros");
        for (i=0; i <numeros.length ; i++) {
            System.out.println("numeros["+i+"]= ");
            numeros[i]=sc.nextInt();
            }

        //Recorrer el array y calcular la media

        for ( i = 0; i < numeros.length ; i++) {

            if (i % 2 == 0);// si la posicion es par
            {sumapar= sumapar + numeros[i];

            }
        }

        //calcular y mostrar la media
        System.out.println("la suma total de los numeros pares="+sumapar);
        System.out.println("la media de los valores que se encuentran en las posiciones pares:"+ sumapar/5);
    }

}
