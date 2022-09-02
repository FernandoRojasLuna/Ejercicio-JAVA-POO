package com.example.tareapoojava;

import java.util.Scanner;

public class tio {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre de su tio");
        nombre = dato.nextLine();

        String trabajo;
        System.out.println("su tio trabaja en ?: ");
        trabajo = dato.nextLine();

        int numhijos;
        System.out.println("cuantos hijos tiene su tio");
        numhijos = dato.nextInt();


        System.out.println("El nombre de su tio es: "+nombre);
        System.out.println("su tio trabaja en: "+trabajo);
        System.out.println("Su tio tiene esta cantidad de hijos: "+numhijos);

    }


}
