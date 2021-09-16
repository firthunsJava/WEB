package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	3. Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo. También muestra los alumnos con notas
	superiores a la media. El número de alumnos se lee por teclado.
    Este programa utiliza un array de elementos de tipo double que contendrá las notas de los alumnos.
    El tamaño del array será el número de alumnos de la clase, por lo tanto primero se pedirá por teclado el número de alumnos y a
    continuación se creará el array.
    Se realizan 3 recorridos sobre el array, el primero para asignar a cada elemento las notas introducidas por teclado,
    el segundo para sumarlas y calcular la media y el tercero para mostrar los alumnos con notas superiores a la media.
	 */
        int i=0;
        int numeroAlumno=0;
        double suma=0, media;
        Scanner sc= new Scanner(System.in);
        // vamps a solicitar al usuario el numero de alumnos y ademas debe de ser positivo
        do {
                System.out.println("¿Cuantos Alumnos hay en la clase?");
                numeroAlumno = sc.nextInt();
            } while (numeroAlumno<=0);

    //se crea un array llamado notas de numeroAlumno elementos de tipo double
        double[] notas= new double[numeroAlumno];
        //  entrada de datos. Se lee la nota de cada alumno y se guarda en cada elemento del array.
        for ( i = 0; i <notas.length ; i++) {
            System.out.println("Alumno "+ (i+1)+", Nota final:");
            notas[i]=sc.nextDouble();
        }
        // sumar todas las notas
        for ( i = 0; i <notas.length ; i++) {
            suma=suma +notas[i];
        }
//calcular la media y mostar la nota media
        media= suma/notas.length;
        System.out.println("La media del curso: "+ media);
// mostras los valores superiores a la media
        for ( i = 0; i < notas.length; i++) {
           if(notas[i]>media)
               System.out.println("Alumno numero"+(i+1)+ " Nota Final: "+ notas[i]);
        }
    }
}
