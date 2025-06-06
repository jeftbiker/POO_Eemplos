/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplobiblioteca;

/**
 *
 * @author ACER
 */
public class EjemploBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel"
                + "García Márquez", "Sudamericana","858.67/M566",  1967);
        biblioteca1.agregarLibro(libro1);        
        biblioteca1.mostrarLibros();
    }
}
