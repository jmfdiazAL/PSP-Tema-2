/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author jmfdiaz
 */
public class CountDown extends Thread {
    @Override
    public void run() {
        long tiempo = System.currentTimeMillis();
        
        //SÓLO DE EJEMPLO
        //Puede que el cuerpo no necesite un sleep, es sólo para rellenar
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException ex) {
            System.out.println("Interrupción!");
        }
        System.out.println("Tiempo ejecución CountDown: "+(System.currentTimeMillis()-tiempo)+"ms");
    }   
}
