package com.company.DatosAvanzados;

import java.util.Vector;

public class main {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("elemento1");
        vector.add("elemento2");
        vector.add("elemento3");
        vector.add("elemento4");
        vector.add("elemento5");

        System.out.println(vector);

        vector.remove("elemento2");
        vector.remove("elemento3");

        System.out.println(vector);
    }
}

// Indica cuál es el problema de utilizar un Vector con la capacidad
// por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

// Cuando superamos la capacidad por defecto que serian 10 elementos se hace una copia en un nuevo array, entonces habrian 20 elementos.
// En este caso son 1000 elementos con la copia serian 2000 elemetos, el problema esta en que estamos usando mas espacio en memoria.
// Entonces lo mejor seria poner una capacidad de 1000 elementos, evitando que se duplique en la memoria.

