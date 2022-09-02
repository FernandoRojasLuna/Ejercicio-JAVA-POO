package com.example.tareapoojava;

import java.util.Scanner;

public class hijo {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre");
        nombre = dato.nextLine();

        int talla;
        System.out.println("cual es su talla: ");
        talla = dato.nextInt();

        int dni;
        System.out.println("cual es el numero de DNI ");
        dni = dato.nextInt();


        System.out.println("El nombre es: "+nombre);
        System.out.println("su talla es: "+talla);
        System.out.println("Su numero de DNI es: "+dni);

    }

}
