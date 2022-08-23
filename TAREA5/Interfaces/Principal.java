package com.company.Interfaces;

public class Principal {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
    }

