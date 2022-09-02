package com.example.tareapoojava;

import java.util.Scanner;

public class profesor {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre del profesor?");
        nombre = dato.nextLine();

        int codColegiatura;
        System.out.println("cual es su codigo de colegiatura: ");
        codColegiatura = dato.nextInt();

        String aniosExperiencia;
        System.out.println("Ingresela cantidad en años de experiencia>: ");
        aniosExperiencia = dato.next();


        System.out.println("El nombre del profesor es: "+nombre);
        System.out.println("Su cod de colegiatura es: "+codColegiatura);
        System.out.println("sus anios de experiencia es: "+aniosExperiencia);

    }

}
