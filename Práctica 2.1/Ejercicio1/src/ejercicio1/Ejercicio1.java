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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long tiempo = System.currentTimeMillis();
        
        CalculaPrimo t1 = new CalculaPrimo(67);
        CountDown t2 = new CountDown();
        
        t1.start();;
        t2.start();
        
        while (t1.isAlive() || t2.isAlive()) {
        }
        
        System.out.println("Tiempo de ejecución del programa Ejercicio1: "+(System.currentTimeMillis()-tiempo)+"ms");
    }
    
}
