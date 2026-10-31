package com.example;

import java.util.ArrayList;

public class Usuario {
    
    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private ArrayList<Libro> librosPrestados;

    
    public Usuario() {
        librosPrestados = new ArrayList<>();
    }


    public Usuario(String idUsuario, String nombre, String correoElectronico, ArrayList<Libro> librosPrestados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.librosPrestados = librosPrestados;
    }


    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }


    public Usuario(String idUsuario, String nombre, String correoElectronico) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.librosPrestados = new ArrayList<>();
    }



    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        if (idUsuario == null) {
            System.out.println("El ID no puede estar vacio");
        } else {
            this.idUsuario = idUsuario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            System.out.println("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null) {
            System.out.println("El correo no puede estar vacio");
        } else {
            this.correoElectronico = correoElectronico;
        }
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        if (librosPrestados == null) {
            System.out.println("La lista no puede ser nula");
        } else {
            this.librosPrestados = librosPrestados;
        }
    }

    @Override
    public String toString() {
        return "Usuario: " +
            "ID: " + idUsuario +
            ", Nombre: " + nombre +
            ", Correo: " + correoElectronico +
            ", Libros prestados: " + librosPrestados;
    }
}
