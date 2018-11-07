/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez
 */
public class Venta {
    
    private LocalDate FechaHora;
    private ArrayList<Linea> lineas;
    private ArrayList<Moneda> pagoMonedas;

    public Venta() {
        this.lineas = new ArrayList<>();
        this.pagoMonedas = new ArrayList<>();
    }

    public Venta(LocalDate FechaHora, ArrayList<Linea> lineas, ArrayList<Moneda> pagoMonedas) {
        this.FechaHora = FechaHora;
        this.lineas = lineas;
        this.pagoMonedas = pagoMonedas;
    }
    
    

    public LocalDate getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(LocalDate FechaHora) {
        this.FechaHora = FechaHora;
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

    public ArrayList<Moneda> getPagoMonedas() {
        return pagoMonedas;
    }

    public void setPagoMonedas(ArrayList<Moneda> pagoMonedas) {
        this.pagoMonedas = pagoMonedas;
    }
    
    
    
}
