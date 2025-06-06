/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploagregacion;

/**
 *
 * @author ACER
 */
public class Ejemploagregacion {

    public static void main(String[] args) {
       //Crear productos
       Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metálica",1000);
       Producto producto2 = new Producto(2, "Tinta", "Tinta china de color negro.", 3000);
       Producto producto3 = new Producto(3, "Cinta pegante","Cinta adhesiva de color transparente.",800);
       Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.",600);
       //Cerar Ordenes
       OrdenPedido orden1 = new OrdenPedido(1);
       orden1.anadirItem(0, 10, producto4);
       orden1.anadirItem(1, 20, producto2);
       System.out.println(orden1.calcularTotalPedido());
       System.out.println("El total de la orden del pedido es: "+orden1);
    }
}
