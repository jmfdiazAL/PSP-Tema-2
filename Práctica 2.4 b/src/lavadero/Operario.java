/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadero;

import static java.lang.Thread.sleep;
import java.util.concurrent.Callable;

/**
 *
 * @author jmfdiaz
 */
public class Operario implements Callable<OperarioRet>{
    private Coche coche;
    private String nombre;

    @Override
    public OperarioRet call() {
        long tiempoIni = System.currentTimeMillis(); //Almacenamos tiempo inicial
        System.out.println(">>> INICIO Operario "+getNombre()+ " lavando coche "+coche.getNombre()+" <<<");
        
        try {
            sleep(coche.getTiempoLavado()*1000);
        } catch (Exception ex){
            System.err.println("ERROR al procesar el hilo "+getNombre());
        }
        
        long tiempoTot = (System.currentTimeMillis()-tiempoIni)/1000; //Calculamos el tiempo total de ejecucion
        System.out.println("--- FIN Operario "+getNombre()+" ha terminado con coche "+coche.getNombre()+" (Tiempo: "+tiempoTot+"s) ---");
        
        return new OperarioRet(getNombre(), coche.getNombre(), tiempoTot);
    }
    
    Operario(String nombre, Coche coche){
        this.nombre=nombre;
        this.coche=coche;
    }
    
    public String getNombre(){
        //return this.nombre;
        return Thread.currentThread().getName();
    }
}
