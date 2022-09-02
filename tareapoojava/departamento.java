package com.example.tareapoojava;

import java.util.Scanner;

public class departamento {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int numPiso;
        System.out.println("Cuantos pisos tiene el edificio: ");
        numPiso = dato.nextInt();

        int numBanio;
        System.out.println("Cuantos baños tiene: ");
        numBanio = dato.nextInt();

        int numHabitaciones;
        System.out.println("Cuantas habitaciones tiene: ");
        numHabitaciones = dato.nextInt();

        System.out.println("El edificio tiene es: "+numPiso+ " pisos");
        System.out.println("El edificio tiene : "+numBanio+ " banios");
        System.out.println("El edificio tiene: "+numHabitaciones+ " habitaciones");

    }

}
