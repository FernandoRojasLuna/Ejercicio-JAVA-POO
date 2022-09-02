package com.example.tareapoojava;

import java.util.Scanner;

public class primo {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre de su primo?");
        nombre = dato.nextLine();

        int edad;
        System.out.println("cual es su la edad de su primo: ");
        edad = dato.nextInt();

        String genero;
        System.out.println("Ingrese el genero de su primo: ");
        genero = dato.next();


        System.out.println("El nombre de su primo es: "+nombre);
        System.out.println("la edad de su primo es: "+edad);
        System.out.println("Su genero es "+genero);

    }


}
