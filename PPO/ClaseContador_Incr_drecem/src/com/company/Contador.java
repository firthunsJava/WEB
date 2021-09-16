package com.company;

public class Contador {

    //----------------- ATRIBUTOS
    private int cont;


    //--------------------------------------- CONSTRUCTORES-----------------------------------------------------
    //Constructor por defecto
   public Contador(){}

    //Constructor con parámetros para inicializar el contador con un valor no negativo. Si el valor inicial que se recibe es negativo el contador tomará el valor cero como valor inicial.
            public Contador (int cont)
            {
                this.setCont(cont); // en este constructor le estoy metiendo la proteccion con el setters controlando lo que mete el usuario.
            }
    // Constructor copia.
        public Contador(final Contador c)
        {
            cont=c.cont;
        }

    //------------------------------ SETTERS Y GETTERS-------------------------------------------
        public void setCont(int cont)
        {
            if (cont<0)
                this.cont=0;
            else
                this.cont=cont;
        }

        public int getCont()
        {
            return cont;
        }
    //-------------------------- METODOS------------------------------------------
    // Metodo>>>>>>>incrementar: incrementa el contador en una unidad.
    public void Incrementar()
    {
        cont++;

    }


    //decrementar: decrementa el contador en una unidad. El contador nunca podrá tener un valor negativo. Si al decrementar se alcanza un valor negativo el contador toma el valor cero.
    public void decrementar()
    {
        cont--;
        if(cont<0)
            cont=0;
    }


}
