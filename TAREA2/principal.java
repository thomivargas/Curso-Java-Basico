package com.company;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        int valor = precio();
        double total = iva(valor);
        System.out.printf("total con iva: $" + total);
    }
    public static int precio(){
        Scanner scanner = new Scanner((System.in));
        System.out.println("Ingrese el precio:");
        int valor = scanner.nextInt();
        return valor;
    }
    public static double iva(int valor){
        double iva = (valor * 21)/100;
        double total = valor + iva;
        return total;
    }
}
