/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploagregacion;

import java.util.Vector;

/**
 *
 * @author ACER
 */
public class OrdenPedido {
    // Atributo que representa el identificador de la orden
    private int identificador;
    /* Atributo que identifica los ítems del pedido por medio de un vector
    de Líneas de Pedido */
    private Vector itemsPedido;
    //Cosntructor
    public OrdenPedido(int identificador) {
        this.identificador = identificador;
        itemsPedido = new Vector();
    }
    //Setters y Getters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    /**
    * Método que calcula el total de una orden de pedido
    * @return El total de una orden de pedido
    */
    public int calcularTotalPedido(){
        int totalOrden = 0;
        /* Recorre el vector de líneas de pedido */ 
        for (int i = 0; i < itemsPedido.size(); i++) {
            // Obtiene cada objeto del vector aplicando casting
            LineaPedido linea = (LineaPedido)itemsPedido.elementAt(i);
            totalOrden += linea.CalcularSubTotalLineaPedido();
        }
        return totalOrden;
    }

    @Override
    public String toString() {
        return "OrdenPedido{" + "\nidentificador=" + identificador 
                + ",\nitemsPedido=" + itemsPedido + '}';
    }
    
    public void anadirItem(int identificador, int cantidad, Producto producto){
        LineaPedido linea = new LineaPedido(identificador, cantidad, producto);
        itemsPedido.add(linea);
    }
    
    
}
