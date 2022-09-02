package com.example.tareapoojava;

import java.util.Scanner;

public class casa {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int numHabitacion;
        System.out.println("cuantas habitaciones hay?: ");
        numHabitacion = dato.nextInt();

        int numPiso;
        System.out.println("cuantas pisos tiene?: ");
        numPiso = dato.nextInt();

        String tamanio;
        System.out.println("que tan grande es?");
        tamanio = dato.nextLine();


        System.out.println("hay en total esta cantidad de habitacion: "+numHabitacion);
        System.out.println("la casa tiene: "+numPiso+ " pisos");
        System.out.println("la casa es: " +tamanio);

    }

}
