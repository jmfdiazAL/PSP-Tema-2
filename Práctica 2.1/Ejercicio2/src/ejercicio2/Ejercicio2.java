/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author jmfdiaz
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long tiempo = System.currentTimeMillis();
        
        Thread t1 = new Thread(new CalculaFactores(167000));
        Thread t2 = new Thread(new SaludoRandom());
        Thread t3 = new Thread(new JavaRules());
        
        t1.start();;
        t2.start();
        t3.start();
        
        while (t1.isAlive() || t2.isAlive() ||t3.isAlive()) {
        }
        
        System.out.println("Tiempo de ejecución del programa Ejercicio2: "+(System.currentTimeMillis()-tiempo)+"ms");
    }
    
}
