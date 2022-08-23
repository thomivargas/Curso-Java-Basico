package com.company.DatosAvanzados;

public class main {

    public static <ArraysList> void main(String[] args) {

        System.out.println(reverse("hola mundo"));
        String array1[] = {"elemento1", "elemento2", "elemento3"};
        int array2[][] = new int[2][4];

        for (int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2.length; j++){
                System.out.println("posicion: " + i + " valor: " + j);
            }
        }

        for (String i : array1){
            System.out.println(i);
        }
    }
    public static String reverse(String texto) {
        String stringInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            stringInvertido += texto.charAt(i);
        }
        return stringInvertido;
    }
}

