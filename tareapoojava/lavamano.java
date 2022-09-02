package com.example.tareapoojava;

import java.util.Scanner;

public class lavamano {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String color;
        System.out.println("que color es el lavamanos?");
        color = dato.nextLine();

        String ubicasion;
        System.out.println("donde esta ubicado el lavamanos?");
        ubicasion = dato.nextLine();

        int numLavamanos;
        System.out.println("cuantos lavamamos tiene?: ");
        numLavamanos = dato.nextInt();


        System.out.println("El lavamanos es de color: "+color);
        System.out.println("El lavamanos esta en: "+ubicasion);
        System.out.println("hay : "+numLavamanos+ " lavamanos");

    }

}
