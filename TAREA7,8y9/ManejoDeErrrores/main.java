package com.company.DatosAvanzados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            DividePorCero(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }
    }

    public static int DividePorCero(int num1, int num2) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = num1 / num2;
            System.out.println("Resultado es: " + resultado);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }
}

