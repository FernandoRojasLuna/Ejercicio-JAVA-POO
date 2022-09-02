package com.example.tareapoojava;

import java.util.Scanner;

public class calzado {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int talla;
        System.out.println("Ingrese su talla: ");
        talla = dato.nextInt();

        String genero;
        System.out.println("Ingrese su genero");
        genero = dato.next();

        String color;
        System.out.println("Ingrese el color: ");
        color = dato.next();

        System.out.println("La talla es: "+talla);
        System.out.println("El genero es: "+genero);
        System.out.println("El color del calzado es: "+color);

    }

}
