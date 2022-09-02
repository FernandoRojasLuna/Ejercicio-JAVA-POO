package com.example.tareapoojava;

import java.util.Scanner;

public class galleta {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String marca;
        System.out.println("Ingrese la marca de la galleta");
        marca = dato.nextLine();

        String sabor;
        System.out.println("Ingrese el sabor de la galleta");
        sabor = dato.nextLine();

        int precio;
        System.out.println("Digite el precio de la galleta: ");
        precio = dato.nextInt();


        System.out.println("La marca de la galleta es: "+marca);
        System.out.println("El sabor de la galleta es: "+sabor);
        System.out.println("El precio de la galleta es: "+precio);

    }

}
