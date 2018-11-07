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
public class Bebida extends Producto{

    private int litros;
    private float valorLitro;
    
    @Override
    public double calcularValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Bebida() {
    }

    public Bebida(int litros, float valorLitro, int numero, int unidadesDisponibles) {
        super(numero, unidadesDisponibles);
        this.litros = litros;
        this.valorLitro = valorLitro;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
    
    
    
}
