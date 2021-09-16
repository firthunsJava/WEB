package com.company;

public class Main {
    public static void imprimirArray(int[] aImprimir)
    {
                    for(int i = 0; i < aImprimir.length; i++){
                          System.out.println(aImprimir[i] + " ");
                       }
                   System.out.println();
    }
              public static void main(String[] args) {
          	// write your code here
                   int[] base = {10, 20, 30, 40, 50, 60, 70, 80};
                   int[] combinacion = new int[5];

                  for(int i=0; i < combinacion.length; i++){
                          boolean repetido = false;
                          do{
                               repetido = false;
                                   int aleatorio = (int)(Math.random() * 8);
                                   for(int j = 0; j < combinacion.length; j++){
                                           if(combinacion[j] == base[aleatorio])
                                                   repetido = true;
                                      }

                                  for(int j = 0; j < combinacion.length; j++){
                                          System.out.println("combinacion: " + combinacion[j]);
                                           System.out.println("Aleatorio: " + base[aleatorio]);
                                       }
                                  if(!repetido)
                                     combinacion[i] = base[aleatorio];
                             }while (repetido);
                       }
                  imprimirArray(combinacion);
              }
}
