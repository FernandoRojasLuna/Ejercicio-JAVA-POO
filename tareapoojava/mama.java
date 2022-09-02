package com.example.tareapoojava;

import java.util.Scanner;

public class mama {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre de su mama");
        nombre = dato.nextLine();

        String apellido;
        System.out.println("cual es el apellido de su mama");
        apellido = dato.nextLine();

        int edad;
        System.out.println("cual es la edad de su mama: ");
        edad = dato.nextInt();


        System.out.println("El nombre de su mama es: "+nombre);
        System.out.println("El apellido de su mama es: "+apellido);
        System.out.println("la edad de su mama es: "+edad);

    }

}
