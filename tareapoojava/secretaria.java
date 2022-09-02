package com.example.tareapoojava;

import java.util.Scanner;

public class secretaria {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String nombre;
        System.out.println("Cual es el nombre de la secretaria?");
        nombre = dato.nextLine();

        int horario;
        System.out.println("cuantas horas trabaja?: ");
        horario = dato.nextInt();

        int sueldo;
        System.out.println("cuanto gana la secretaria?: ");
        sueldo = dato.nextInt();


        System.out.println("El nombre de la secretaria es: "+nombre);
        System.out.println("La secretaria trabaja estas horas: "+horario);
        System.out.println("la secretaria gana: "+sueldo);

    }

}
