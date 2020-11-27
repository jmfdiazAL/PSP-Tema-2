package lavadero;

import java.util.ArrayList;
import java.util.List;
import lavadero.Coche.Size;
import lavadero.Coche.Wash;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmfdiaz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Coche> listaCoches = new ArrayList<>();
    
        listaCoches.add(new Coche("Seat Ibiza", Size.PEQUEÑO, Wash.NORMAL));    //10
        listaCoches.add(new Coche("VW Touran", Size.GRANDE, Wash.SUPER));       //20
        listaCoches.add(new Coche("Opel Zafira", Size.GRANDE, Wash.EXTRA));     //22
        listaCoches.add(new Coche("Renault Megane", Size.MEDIANO, Wash.SUPER)); //16

        listaCoches.sort((c1, c2) -> c2.getTiempoLavado().compareTo(c1.getTiempoLavado()));
       
        long tiempoIni = System.currentTimeMillis(); //Almacenamos tiempo inicial
        System.out.println(">>> INICIO Lavadero <<<");

        //Aquí pondremos el código para lanzar los hilos
        
        long tiempoTot = (System.currentTimeMillis()-tiempoIni)/1000; //Calculamos el tiempo total de ejecucion
        System.out.println("--- FIN Lavadero (Tiempo: "+tiempoTot+"s) ---");
    }
    
}
