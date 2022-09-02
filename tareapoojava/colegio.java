package com.example.tareapoojava;

import java.util.Scanner;

public class colegio {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre del colegio?");
        nombre = dato.nextLine();

        int numAlumnos;
        System.out.println("cual es la cantidad de alumnos: ");
        numAlumnos = dato.nextInt();

        String direccion;
        System.out.println("Ingrese la direccion del colegio");
        direccion = dato.next();


        System.out.println("El nombre de su primo es: "+nombre);
        System.out.println("la edad de su primo es: "+numAlumnos);
        System.out.println("Su genero es "+direccion);

    }

}
