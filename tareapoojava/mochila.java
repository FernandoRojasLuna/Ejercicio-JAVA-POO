package com.example.tareapoojava;

import java.util.Scanner;

public class mochila {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String color;
        System.out.println("Ingrese el color de la mochila");
        color = dato.nextLine();

        String marca;
        System.out.println("Ingrese la marca de la mochila");
        marca = dato.nextLine();

        String tamanio;
        System.out.println("Ingrese el tamaño de la mochila");
        tamanio = dato.next();

        System.out.println("La mochila es de color: " + color);
        System.out.println("La marca de la mochila es: " + marca);
        System.out.println("El tamaño de la mocjila es: " + tamanio);

    }
}
