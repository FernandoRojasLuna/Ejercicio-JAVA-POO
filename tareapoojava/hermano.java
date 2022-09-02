package com.example.tareapoojava;

import java.util.Scanner;

public class hermano {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual el nombre de su hermano");
        nombre = dato.nextLine();

        String pareja;
        System.out.println("cual es el nombre de la pareja de su hermano: ");
        pareja = dato.nextLine();

        String carrera;
        System.out.println("cual es la carrera de su hermano: ");
        carrera = dato.nextLine();


        System.out.println("El nombre de su hermano es: "+nombre);
        System.out.println("El nombre de supareja es: "+pareja);
        System.out.println("La carrera de su hermano es: "+carrera
        );

    }


}
