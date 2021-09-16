package com.company;
import java.util.Arrays;


/*
22) Generar un arreglo con numero aleatorios no repetidos entre sí.
 */


    public class Main {

            public static void main(String[] args) {

                //Valores usados para generar el arreglo
                int minimo=0;
                int maximo=8;
                int longitud=5;

                //En caso de que uno sea mayotr que otro
                //Lo intercambiamos
                if(maximo<minimo){
                    int aux=maximo;
                    maximo=minimo;
                    minimo=aux;
                }

                //Si caben los numeros del rango
                //Generamos el array
                if( (maximo-minimo) >= (longitud-1) ){

                    int numero_elementos=0;
                    int numeros[]=new int[longitud];
                    //RECOMENDADO: rellena el arreglo con un numero que nunca se va a generar
                    Arrays.fill(numeros, minimo-1);//Valor con el que se va a rellenar el arreglo, en este caso -1. sino lo haría con ceeros
                    for (int i = 0; i <numeros.length ; i++) {

                        System.out.println(numeros[i]);
                    }

                    boolean encontrado;
                    int aleatorio;

                    //Hasta que el numero de elementos no sea como el de la longitud del array no salimos
                    while(numero_elementos<longitud){

                        aleatorio=generaNumeroAleatorio(minimo,maximo);
                        encontrado=false;

                        //Buscamos si el numero existe
                        for(int i=0;i<numeros.length && !encontrado;i++){
                            if(aleatorio==numeros[i]){
                                encontrado=true;
                            }
                        }

                        //Si esta lo indicamos Sino lo agregamos
                        if(encontrado){
                            System.out.println("El numero existe: "+aleatorio);
                        }else{
                            numeros[numero_elementos++] = aleatorio;
                            System.out.println("Agregado el numero: "+aleatorio);
                        }

                    }

                    //Mostramos el arreglo
                    System.out.print("Mostrar arreglo>>>  ");
                    for(int i=0;i<numeros.length;i++){
                        System.out.print(numeros[i]+ " ");
                    }

                }else{
                    System.out.println("Que no se puede generar");
                }


            }

            //Genera un numero aleatorio entre el minimo y el maximo, includo el maximo y el minimo
            public static int generaNumeroAleatorio(int minimo,int maximo){

                int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
                return num;
            }

        }

