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
public class Moneda {
    private int cantidad;
    private int cantidadInicialDia;
    private Denominacion denominacion;

    public Moneda() {
    }

    public Moneda(int cantidad, Denominacion denominacion) {
        this.cantidad = cantidad;
        this.cantidadInicialDia = cantidad;
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.cantidadInicialDia = cantidad;
    }

    public int getCantidadInicialDia() {
        return cantidadInicialDia;
    }

    public void setCantidadInicialDia(int cantidadInicialDia) {
        this.cantidadInicialDia = cantidadInicialDia;
    }

    public Denominacion getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(Denominacion denominacion) {
        this.denominacion = denominacion;
    }
    
    
    
}
