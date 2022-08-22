package com.company.Clases;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartphone = new SmartPhone("Exynos 2100", "Led", "negro", "litio", "48px",256);
        SmartDevice smartwatch = new SmartWatch("snapdragon", "led", "rojo", "litio");
        System.out.println(smartphone.toString());
        System.out.println(smartwatch.toString());
    }
}
