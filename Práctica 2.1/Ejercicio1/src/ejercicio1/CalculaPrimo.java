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
public class CalculaPrimo extends Thread {
    private long n = 0;
    
    CalculaPrimo(long l) {
        n = l;
    }
    
    @Override
    public void run() {
        long tiempo = System.currentTimeMillis();
        
        //SÓLO DE EJEMPLO
        //Puede que el cuerpo no necesite un sleep, es sólo para rellenar
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
            System.out.println("Interrupción!");
        }
        System.out.println("Tiempo ejecución CalculaPrimo: "+(System.currentTimeMillis()-tiempo)+"ms");
    }   
}
