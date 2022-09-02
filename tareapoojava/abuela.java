package com.example.tareapoojava;

import java.util.Scanner;

public class abuela {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre de su abuela");
        nombre = dato.nextLine();

        int propiedades;
        System.out.println("cuantas propiedades tiene: ");
        propiedades = dato.nextInt();

        int hijos;
        System.out.println("cuantos hijos tiene? ");
        hijos = dato.nextInt();


        System.out.println("El nombre de su abuela es?: "+nombre);
        System.out.println("tiene estas propiedades: "+propiedades);
        System.out.println("el numero de hijos es: "+hijos);

    }


}
