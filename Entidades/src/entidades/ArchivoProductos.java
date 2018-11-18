/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Emanuel Álvarez
 */
public class ArchivoProductos {
    
    @XmlElement (name = "producto")
    private List<Producto> registros = new ArrayList<>();
    
    public ArchivoProductos(){
        this.registros.add(new Alimento(10, 20, 1, "Perico", 100));
        this.registros.add(new Bebida(500, 6000, 2 ,"Guaro", 50));
    }
    
    
}
