package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here/*
        // * Programa que crea un array de 20 elementos
        // * llamado Pares y guarde los 20 primeros
        // * números pares.
        // * Mostrar por pantalla el contenido
        // * del array creado
        // */
        int[] numeropar= new int[20];
        int i, contador=2;

        Scanner sc= new Scanner(System.in);

        for ( i = 0; i < numeropar.length; i++) {
            numeropar[i]=contador; // en la primera vuelta le estamos asignando para numeropar[0]=2;
            contador+=2;// Para numeropar[0]=4

        }
        // mostrar el array
        for (i = 0; i < numeropar.length ; i++) {
            System.out.println(numeropar[i]);

        }




    }
}
