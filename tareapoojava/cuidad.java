package com.example.tareapoojava;

import java.util.Scanner;

public class cuidad {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int parque;
        System.out.println("cuantos parques tiene?: ");
        parque = dato.nextInt();

        int atractivo;
        System.out.println("cuantos atractivos tiene?: ");
        atractivo = dato.nextInt();

        int provincia;
        System.out.println("cuantas provincias lo rodean?");
        provincia = dato.nextInt();


        System.out.println("tiene: "+parque+ " parques");
        System.out.println("tiene: "+atractivo+ " atractivos");
        System.out.println("lo rodean : "+provincia+ " provincias");

    }

}
