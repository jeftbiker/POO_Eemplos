/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplobiblioteca;
import java.util.ArrayList;
/**
 *
 * @author ACER
 */
public class Biblioteca {
    String nombre;
    ArrayList<Libro> coleccionLibros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new ArrayList<Libro>();
    }
    
    
    public void agregarLibro(Libro libro){
        coleccionLibros.add(libro);
    }
    
    public void mostrarLibros(){
        for(int i = 0; i < coleccionLibros.size(); i++) {
            Libro libro = (Libro)coleccionLibros.get(i);
            libro.imprimir();
        }
    }
    
    
}
