package com.example.tareapoojava;

import java.util.Scanner;

public class celular {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        String marca;
        System.out.println("Ingrese la marca del celular");
        marca = dato.nextLine();

        int codImei;
        System.out.println("Ingrese su cod Imei: ");
        codImei = dato.nextInt();

        String sistOperativo;
        System.out.println("Ingrese su sistema operativo");
        sistOperativo = dato.next();


        System.out.println("La marca del celular es: "+marca);
        System.out.println("El codigo Imei es: "+codImei);
        System.out.println("El sistema operativo es: "+sistOperativo);

    }

}
