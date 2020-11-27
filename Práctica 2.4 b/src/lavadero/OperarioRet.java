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
public class OperarioRet {
    private String nOperario;
    private String nCoche;
    private Long tiempo;
    
    OperarioRet(String nOperario, String nCoche, Long tiempo){
        this.nOperario=nOperario;
        this.nCoche=nCoche;
        this.tiempo=tiempo;
    }

    /**
     * @return the nOperario
     */
    public String getnOperario() {
        return nOperario;
    }

    /**
     * @return the nCoche
     */
    public String getnCoche() {
        return nCoche;
    }

    /**
     * @return the tiempo
     */
    public Long getTiempo() {
        return tiempo;
    }
    
}
