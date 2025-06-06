/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composicion;

/**
 *
 * @author ACER
 */
public class Composicion {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(2,3,5);
        circulo1.imprimir();
        Recta recta1 = new Recta(3,2,7,6);
        recta1.CalcularPendiente();
        recta1.CalcularLongitud();
    }
}
