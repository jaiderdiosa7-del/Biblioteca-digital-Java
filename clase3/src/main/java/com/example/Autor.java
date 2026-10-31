package com.example;

public class Autor {
    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;
    
    public Autor(){
    }
    
    public Autor(String idAutor,String nombre,String nacionalidad,int anioNacimiento){
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
    }

    public Autor(String idAutor, String nombre){
        this.idAutor = idAutor;
        this.nombre = nombre;
    }

    public Autor(String idAutor, String nombre, String nacionalidad){
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getIdAutor(){
        return idAutor;
    }

    public void setIdAutor(String idAutor){
        if (idAutor == null) {
            System.out.println("ID no puede estar vacio");
        } else {
        this.idAutor = idAutor;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if (nombre == null){
            System.out.println("Nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
        
    }

    public String getNacionalidad(){
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad){
        if (nacionalidad == null) {
            System.out.println("Nacionalidad no puede estar vacia");
        } else {
            this.nacionalidad = nacionalidad;
        }
    }

    public int getAnioNacimiento(){
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento){
        if (anioNacimiento <= 0) {
            System.out.println("Año no valido");
        } else {
            this.anioNacimiento = anioNacimiento;
        }
    }

    @Override
    public String toString() {
        return "Autor: " +
            "ID: " + idAutor +
            ", Nombre: " + nombre +
            ", Nacionalidad: " + nacionalidad +
            ", Año de nacimiento: " + anioNacimiento;
}
}

