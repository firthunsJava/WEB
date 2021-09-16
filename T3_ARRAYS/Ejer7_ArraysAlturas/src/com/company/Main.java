package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Leer la altura de N personas y calcular la altura media
         * Mostra cuántos hay superiores a la media.
         */
        Scanner sc = new Scanner((System.in));
        int persona=0, SuperiorMedia=0, inferiorMedia=0;
        double totalaltura=0, media=0;
        // vamos a solicitar al usuario la cantidad de personas
        do{
            System.out.println("cuantas personas vamos a medir");
            persona=sc.nextInt();
        }while (persona<=0);

        //se crea el array de persona
        double[] altura=new double[persona];
        // lectura de la alturas de las personas medidas
        for (int i = 0; i <altura.length ; i++) {
            System.out.println("la ALTURA DE LA PERSONA"+(i+1));
             altura[i]=sc.nextDouble();
        }
        // vamos a recorrer el array y sumar todas las alturas paraq sacar su media
        //recorremos el array para ver cuantos hay más altos
        //que la media y cuantos más bajos
        for (int i = 0; i <altura.length ; i++) {
            totalaltura += altura[i];
            media=totalaltura/altura.length;// aqui esta metido la media de todas las alturas metidas
            if (altura[i]>media)
                            SuperiorMedia +=1;
            else
                inferiorMedia+=1;

        }
        System.out.println("La altura media de las "+ persona+" personas=" +media);
        System.out.println("hay "+SuperiorMedia+" personas que estan por encima de la media");
        System.out.println("hay "+inferiorMedia+" personas que estan por debajo de la media");




    }
}
