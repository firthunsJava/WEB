package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Programa que lea por teclado 10 números enteros y los guarde en un array.
         * A continuación calcula y muestra la media de los valores positivos y la  de los valores negativos.
         */
        int[] numeros = new int[10];// array que contendrá los números leídos por teclado

        int positivo = 0, negataivo = 0;// contadores de los numeros positivos
        double sumapositivo = 0, sumanegativos = 0;// acumuladores para las sumas de positivos y negativos
        Scanner sc = new Scanner(System.in);
        // lectura de datos y llenar el array
        System.out.println("Dame diez numeros, bien sea positivo o negativo:");
        // length me indica que se tome el ultimo valor del array
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = sc.nextInt();
        }
        // recoger el array para sumar por separado los numeros positivos y los negativos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= 0) {
                sumapositivo += numeros[i];// en esta liena estoy metiendo la suma total de todos los positivos
                positivo++; // en esta linea estoy metiendo el contador de positivos
            } else {
                if (numeros[i] != 0) {
                    sumanegativos += numeros[i];
                    negataivo++;
                }
            }
        }
        // Calcular y mostrar las medias
        //  System.out.println("la suma total positivos: "+(sumapositivo) + "Media de la suma="+ (sumapositivo/positivo) );
        //  System.out.println("La suma total de los negativos:"+ (sumanegativos)+ " , Media de los negativos=" + (sumanegativos/negataivo));
        if (positivo != 0) {
            System.out.println("la Media de los valores positivos=" + sumapositivo / positivo);
        } else {
            System.out.println("no ha intrucido numeros positivos");
        }
        if( negataivo!=0){
            System.out.println("la media de los valores negativos="+ sumanegativos/negataivo);
        }else
        {
            System.out.println("no ha introducido numeros negativos");
        }
    }
}
