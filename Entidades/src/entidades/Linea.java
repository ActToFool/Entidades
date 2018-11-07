/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Emanuel Álvarez
 */
class Linea {
    
    private int cantidad;
    private Producto productoVendido;

    public Linea() {
    }

    public Linea(int cantidad, Producto productoVendido) {
        this.cantidad = cantidad;
        this.productoVendido = productoVendido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }
    
    
    
}
