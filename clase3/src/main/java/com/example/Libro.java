package com.example;

public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    public Libro(){
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion,double precio, int stock){
        this.isbn =  isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.precio = precio;
        this.stock = stock;
    }

    public Libro (String isbn, String titulo){
        this.isbn = isbn;
        this.titulo = titulo;
        
    }

    public Libro (String isbn, String titulo, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        if (isbn == null){
            System.out.println("El ISBN no puede estar vacio");
        }else{
            this.isbn = isbn;
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if (titulo == null){
            System.out.println("Titulo no puede estar vacio");
        }else{
            this.titulo = titulo;
        }
    }

     public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor == null) {
            System.out.println("El autor no puede estar vacio");
        } else {
            this.autor = autor;
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= 0) {
            System.out.println("El año de publicacion no es valido");
        } else {
            this.anioPublicacion = anioPublicacion;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("El precio no es valido");
        } else {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("El stock no puede ser negativo");
        } else {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "Libro: " +
            "ISBN: " + isbn +
            ", Titulo: " + titulo +
            ", Autor: " + autor +
            ", Año de publicacion: " + anioPublicacion +
            ", Precio: " + precio +
            ", Stock: " + stock;
}

}