package com.example.tareapoojava;

import java.util.Scanner;

public class parque {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Ingrese el nombre del parque");
        nombre = dato.nextLine();

        int sillas;
        System.out.println("Digite la cantidad de sillas que hay: ");
        sillas = dato.nextInt();

        int piletas;
        System.out.println("Digite la cantidad de piletas que hay: ");
        piletas = dato.nextInt();


        System.out.println("El nombre del parque es: "+nombre);
        System.out.println("La cantidad de sillas son: "+sillas);
        System.out.println("La cantidad de piletas que hay es: "+piletas);

    }

}
