package com.example.tareapoojava;

import java.util.Scanner;

public class mascota {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String mascota;
        System.out.println("Ingrese nombre de la mascota");
        mascota = dato.nextLine();

        int edad;
        System.out.println("Digite su edad: ");
        edad = dato.nextInt();

        String raza;
        System.out.println("Ingrese la raza de la mascota");
        raza = dato.next();

        System.out.println("Nombre de la mascota: "+mascota);
        System.out.println("La edad es: "+edad);
        System.out.println("La raza de la mascota es: "+raza);

    }
}