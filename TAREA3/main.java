package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] nombres = {"pepe", "juan", "ruperta"};
        mostrarNombres(nombres);
    }

    public static void mostrarNombres(String nombres[]){
        System.out.println("Nombres del arreglo:");
     for(String nombre : nombres){
         System.out.println(nombre);
     }
    }
}
