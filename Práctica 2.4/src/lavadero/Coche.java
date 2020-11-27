/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadero;

/**
 *
 * @author jmfdiaz
 */
public class Coche {
    public enum Size {
        PEQUEÑO,
        MEDIANO,
        GRANDE
    }
    
    public enum Wash {
        NORMAL,
        EXTRA,
        SUPER
    }

    private String nombre;
    private Size size;
    private Wash wash;
    private int tiempoLavado=10;
    
    Coche(String nombre, Size size, Wash wash){
        this.nombre = nombre;
        this.size=size;
        this.wash=wash;

        switch (wash) {
            case SUPER:
                tiempoLavado+=2;
                break;
            case EXTRA:
                tiempoLavado+=4;
                break;
        }
                
        switch (size) {
            case MEDIANO: 
                tiempoLavado+=4;
                break;
            case GRANDE: 
                tiempoLavado+=8;
                break;
        }
    }
    
    public Integer getTiempoLavado() {
        return tiempoLavado;
    }
    
    public String getNombre(){
        return nombre;
    }
}
