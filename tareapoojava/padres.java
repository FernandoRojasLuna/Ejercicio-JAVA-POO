package com.example.tareapoojava;

import java.util.Scanner;

public class padres {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre del padre?");
        nombre = dato.nextLine();

        int numHijos;
        System.out.println("cual es la el numero de hijos: ");
        numHijos = dato.nextInt();

        String apellido;
        System.out.println("Ingrese su apellido del padre");
        apellido = dato.next();


        System.out.println("El nombre del apdre es: "+nombre);
        System.out.println("El numero de hijos es: "+numHijos);
        System.out.println("Su apellido es: "+apellido);

    }

}
