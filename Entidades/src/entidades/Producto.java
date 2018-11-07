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
public abstract class Producto {
    
    private int numero;
    private int unidadesDisponibles;
    
    //Hay que preguntarle al profesor si es abstracto o no
    public abstract double calcularValor();

    public Producto() {
    }

    public Producto(int numero, int unidadesDisponibles) {
        this.numero = numero;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    
}
