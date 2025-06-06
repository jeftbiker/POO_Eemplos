/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploagregacion;

/**
 *
 * @author ACER
 */
class LineaPedido {
    private int identificador;
    private int cantidad;
    private Producto producto;

    public LineaPedido(int identificador, int cantidad, Producto producto) {
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    /**
    * Método que calcula el subtotal de la línea de pedido
    * @return El subtotal de la línea de pedido
    */
    public int CalcularSubTotalLineaPedido(){
        return cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return "LineaPedido{" + "identificador=" 
                + identificador + ", cantidad=" + cantidad 
                + ", producto=" + producto + '}';
    }
    
    
    
}
