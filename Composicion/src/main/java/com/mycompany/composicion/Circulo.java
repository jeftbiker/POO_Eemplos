/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composicion;

/**
 *
 * @author ACER
 */
public class Circulo {
    
    int radio;
    Punto centro;

    public Circulo(int x,int y, int radio) {
        this.radio = radio;
        //crear la instancia de la clase Punto pasanto las coordenadas que recibe
        //el constructor de la clase 
        centro = new Punto(x,y); 
        
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public void imprimir(){
        System.out.println("El centro del circulo es la coordenada (" +
            centro.getX() + "," + centro.getY() + ") y tiene un radio = " +
            radio);
    }
    
    
    
    
    
}
