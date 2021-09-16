package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*
       5. Programa Java que guarda en un array 10 números enteros que se leen por teclado. A
       continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
        */
        int i;
        int[] numero=new int[10];
        Scanner sc= new Scanner(System.in);
        // cargamos el array con los numeros solicitados-----------------
        System.out.println("intruduce 10 numeros:");
        for ( i = 0; i < numero.length ; i++) {
            numero[i]=sc.nextInt();
        }
// ahora toca recorrer el array para ver numeros positivo, negativos y cuantos ceros hay
        int contadorpositivo=0,contadornegativo=0,contadorcero=0;
        for (i = 0; i < numero.length; i++) {
            if (numero[i]==0)
                contadorcero+=1;
            else
                    if (numero[i]>0)
                        contadorpositivo+=1;
                    else
                        if(numero[i]<0)
                            contadornegativo+=1;
        }
        System.out.println("Numeros positivos totales= " + contadorpositivo);
        System.out.println("Numeros negativos totales= " + contadornegativo);
        System.out.println("Numeros ceros totales= " + contadorcero);
    }
}
