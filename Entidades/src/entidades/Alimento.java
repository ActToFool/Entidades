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
public class Alimento extends Producto {
    
    private int gramos;
    private float valorGramo;
    
    @Override
    public double calcularValor() {
        return 0;
    }

    public Alimento() {
    }

    public Alimento(int gramos, float valorGramo, int numero, String nombre, int unidadesDisponibles, TipoProducto tipo) {
        super(numero, nombre, unidadesDisponibles, tipo);
        this.gramos = gramos;
        this.valorGramo = valorGramo;
    }
    
    public Alimento(int gramos, float valorGramo, int numero, String nombre, int unidadesDisponibles) {
        super(numero, nombre, unidadesDisponibles);
        this.gramos = gramos;
        this.valorGramo = valorGramo;
    }

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public float getValorGramo() {
        return valorGramo;
    }

    public void setValorGramo(float valorGramo) {
        this.valorGramo = valorGramo;
    }
    
    

    
    
}
