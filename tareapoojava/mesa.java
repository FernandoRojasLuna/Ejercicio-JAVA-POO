package com.example.tareapoojava;

import java.util.Scanner;

public class mesa {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int numHornillas;
        System.out.println("Digite cuantas hornillas tiene la cocina: ");
        numHornillas = dato.nextInt();

        int numOllas;
        System.out.println("Digite el numero de ollas: ");
        numOllas = dato.nextInt();

        int numMuebles;
        System.out.println("Digite el numero de mubles: ");
        numMuebles = dato.nextInt();

        System.out.println("laconina tiene: "+numHornillas+ " hornillas");
        System.out.println("La cocina tiene: "+numOllas+ "ollas");
        System.out.println("La cocina tiene : "+numMuebles+ " muebles");

    }

}
