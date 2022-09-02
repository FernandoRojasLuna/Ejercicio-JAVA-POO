package com.example.tareapoojava;

import java.util.Scanner;

public class juguete {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String genero;
        System.out.println("Ingrese el genero: ");
        genero = dato.next();

        int precio;
        System.out.println("Digite el precio: ");
        precio = dato.nextInt();

        String marca;
        System.out.println("Ingrese la marca del la juguete");
        marca = dato.next();

        System.out.println("Nombre de la mascota: "+genero);
        System.out.println("La edad es: "+precio);
        System.out.println("La raza de la mascota es: "+marca);

    }

}
