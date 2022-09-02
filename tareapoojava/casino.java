package com.example.tareapoojava;

import java.util.Scanner;

public class casino {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int juegos;
        System.out.println("cuantos juegos funsionan?: ");
        juegos = dato.nextInt();

        int mesas;
        System.out.println("cuantas mesas estan disponibles?: ");
        mesas = dato.nextInt();

        int anfitrionas;
        System.out.println("cuantas anfitrionas trabajan hoy?: ");
        anfitrionas = dato.nextInt();


        System.out.println("La cantidad juegos es: " + juegos);
        System.out.println("estan disponibles: " + mesas + " mesas");
        System.out.println("acudieron : " + anfitrionas + " anfitrionas");

    }
}
