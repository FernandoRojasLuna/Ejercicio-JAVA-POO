package com.example.tareapoojava;

import java.util.Scanner;

public class personalLimpieza {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre del personal de limpieza?");
        nombre = dato.nextLine();

        String funsion;
        System.out.println("cual es su labor?: ");
        funsion = dato.nextLine();

        int edad;
        System.out.println("cuantos anios tiene?: ");
        edad = dato.nextInt();


        System.out.println("Su nombre del delimpieza es: "+nombre);
        System.out.println("su funsion es: "+funsion);
        System.out.println("El personal de limpieza tiene: "+edad+ " anios");

    }
}
