/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicion;

/**
 *
 * @author ACER
 */
public class Recta {
    
     Punto p1;
     Punto p2;

    public Recta(int x, int y, int z, int w) {
        p1 = new Punto(x,y); 
        p2 = new Punto(z,w); 
    }
    
    public void CalcularPendiente(){
        float pendiente;
        if (p2.getX() == p1.getX()) {
            System.out.println("No se puede dividir entre 0");
        }else{
        pendiente = ((p2.getY() - p1.getY())/(p2.getX()- p1.getX()));
        System.out.println("La pendiente de la recta es: " +pendiente);
        }
    }
    
    public void CalcularLongitud(){
        float longitud;
        
        longitud = (float) Math.sqrt(Math.pow(p2.getX()- p1.getX(),2)+ 
                Math.pow(p2.getY() - p1.getY(),2));
        System.out.println("La longitud de la recta es: "+longitud);
    }
     
    
    
}
