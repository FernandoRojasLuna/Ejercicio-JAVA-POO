package com.example.tareapoojava;

import java.util.Scanner;

public class pais {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String capital;
        System.out.println("cual es su capital?");
        capital = dato.nextLine();

        int regiones;
        System.out.println("cuantas regiones tiene?: ");
        regiones = dato.nextInt();

        int habitantes;
        System.out.println("cuantos habitantes tiene?: ");
        habitantes = dato.nextInt();


        System.out.println("La capital es: "+capital);
        System.out.println("tiene: "+regiones+ " regiones");
        System.out.println("llaves : "+habitantes+ " habitantes");

    }

}
