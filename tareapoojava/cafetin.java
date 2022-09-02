package com.example.tareapoojava;

import java.util.Scanner;

public class cafetin {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String producto;
        System.out.println("que productos vende?");
        producto = dato.nextLine();

        int horario;
        System.out.println("cuantas horas trabaja?: ");
        horario = dato.nextInt();

        int vendedores;
        System.out.println("cuantos vendedores hay?: ");
        vendedores = dato.nextInt();


        System.out.println("Se vende este producto: "+producto);
        System.out.println("El vendedor trabaja estas horas: "+horario);
        System.out.println("tcantidad de personas que venden: "+vendedores);

    }

}
