package com.example.tareapoojava;

import java.util.Scanner;

public class perfume {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String marca;
        System.out.println("Ingrese la marca del perfume");
        marca = dato.nextLine();

        int precio;
        System.out.println("Digite el precio del perfume: ");
        precio = dato.nextInt();

        String genero;
        System.out.println("Ingrese el genero: ");
        genero = dato.next();

        System.out.println("Nombre de la marca es: "+marca);
        System.out.println("La precio es: "+precio);
        System.out.println("Ingrese el generoa: "+genero);

    }

}
