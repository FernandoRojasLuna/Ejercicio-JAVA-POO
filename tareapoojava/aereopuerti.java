package com.example.tareapoojava;

import java.util.Scanner;

public class aereopuerti {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int policia;
        System.out.println("cuantas policias lo resguardan?: ");
        policia = dato.nextInt();

        int avion;
        System.out.println("cuantos aviones tiene?: ");
        avion = dato.nextInt();

        int maleta;
        System.out.println("cuantas maletras trasladan?: ");
        maleta = dato.nextInt();


        System.out.println("La cantidad de policias es: "+policia);
        System.out.println("tiene: "+avion+ " aviones");
        System.out.println("traslada : "+maleta+ " maletas");

    }

}
