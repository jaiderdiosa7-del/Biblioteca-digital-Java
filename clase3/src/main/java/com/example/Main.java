
package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        
        Autor autor1 = new Autor(
            "AUT001",
            "Gabriel Garcia Marquez",
            "Colombiana",
            1927
        );

        
        Libro libro1 = new Libro(
            "ISBN001",
            "Cien años de soledad",
            autor1,
            1967,
            45000,
            10
        );

        Libro libro2 = new Libro(
            "ISBN002",
            "El amor en los tiempos del colera",
            autor1,
            1985,
            50000,
            5
        );

        
        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(libro1);
        libros.add(libro2);

        
        Usuario usuario1 = new Usuario(
            "USR001",
            "Jaider",
            "jaider@gmail.com",
            libros
        );

        
        System.out.println("===== BIBLIOTECA DIGITAL =====");

        System.out.println("\n--- AUTOR ---");
        System.out.println(autor1);

        System.out.println("\n--- LIBROS ---");
        System.out.println(libro1);
        System.out.println(libro2);

        System.out.println("\n--- USUARIO ---");
        System.out.println(usuario1);
    }
}
