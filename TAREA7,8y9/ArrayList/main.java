package com.company.DatosAvanzados;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("elemento1");
        arrayList.add("elemento2");
        arrayList.add("elemento3");
        arrayList.add("elemento4");

        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println(linkedList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for(int i = 1; i<=10;i++){
            arrayList1.add(i);
        }

        System.out.println(arrayList1);

        for(int i = 0; i < arrayList1.size();i++){
            if (arrayList1.get(i) % 2 == 0){
                arrayList1.remove(i);
            }
        }
        System.out.println(arrayList1);
    }
}
