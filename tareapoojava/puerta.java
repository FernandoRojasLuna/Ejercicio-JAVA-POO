package com.example.tareapoojava;

import java.util.Scanner;

public class puerta {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String color;
        System.out.println("que color es la puerta??");
        color = dato.nextLine();

        String tamanio;
        System.out.println("que tamanio es la puerta?");
        tamanio = dato.nextLine();

        int numLlaves;
        System.out.println("cuantas llaves tiene?: ");
        numLlaves = dato.nextInt();


        System.out.println("El color de la puerta es: "+color);
        System.out.println("El tamanio de la puerta es: "+tamanio);
        System.out.println("llaves que tiene son: "+numLlaves);

    }

}
