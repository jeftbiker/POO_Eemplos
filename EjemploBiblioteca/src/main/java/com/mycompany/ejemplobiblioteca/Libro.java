/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplobiblioteca;

/**
 *
 * @author ACER
 */
public class Libro {
    String titulo, autor, editorial,referenciaBibliogradfica;
    int anioPublicacion;

    public Libro(String titulo, String autor, String editorial, String referenciaBibliogradfica, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.referenciaBibliogradfica = referenciaBibliogradfica;
        this.anioPublicacion = anioPublicacion;
    }
    
    public void imprimir(){
    
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("editorial: "+editorial);
        System.out.println("Año publicación: "+anioPublicacion);
    }
    
    
}
