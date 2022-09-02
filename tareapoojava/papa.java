package com.example.tareapoojava;

import java.util.Scanner;

public class papa {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre de su papa");
        nombre = dato.nextLine();

        String nacimiento;
        System.out.println("donde nacio su papa");
        nacimiento = dato.nextLine();

        int edad;
        System.out.println("cual es la edad de su papa: ");
        edad = dato.nextInt();


        System.out.println("El nombre de su papa es: "+nombre);
        System.out.println("Su papa nacio en: "+nacimiento);
        System.out.println("la edad de su papa es: "+edad);

    }

}
