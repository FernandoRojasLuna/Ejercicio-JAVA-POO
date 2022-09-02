package com.example.tareapoojava;

import java.util.Scanner;

public class alumno {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre del alumno?");
        nombre = dato.nextLine();

        String turnoEstudios;
        System.out.println("Que turno estudia?: ");
        turnoEstudios = dato.next();

        String colorUniforme;
        System.out.println("Cual es el color de su uniforme: ");
        colorUniforme = dato.next();


        System.out.println("El nombre del alumno es: "+nombre);
        System.out.println("Su turmo de estudios es: "+turnoEstudios);
        System.out.println("Su color de uniforme es "+colorUniforme);

    }

}
