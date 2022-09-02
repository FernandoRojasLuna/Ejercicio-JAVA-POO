package com.example.tareapoojava;

import java.util.Scanner;

public class farmacia {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int medicinas;
        System.out.println("cuantas medicinas tienes?: ");
        medicinas = dato.nextInt();

        int enfermeras;
        System.out.println("cuantas enfermeras atienden?: ");
        enfermeras = dato.nextInt();

        int pascientes;
        System.out.println("cuantos pascientes acuden?: ");
        pascientes = dato.nextInt();


        System.out.println("La cantidad de medicinas es: "+medicinas);
        System.out.println("atienden: "+enfermeras+ " enfermeras");
        System.out.println("acuden : "+pascientes+ " pascientes");

    }

}
