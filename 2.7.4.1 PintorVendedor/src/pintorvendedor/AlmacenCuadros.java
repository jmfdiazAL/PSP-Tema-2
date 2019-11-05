/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pintorvendedor;

public class AlmacenCuadros {
    //recurso compartido => contador de cuadros en almacen
    private int cuadros=0;

    public synchronized void guardar(){

        try{
            //mientras haya cuadros hay que esperar
            while(cuadros >0)
                //el hilo invoca wait() y se pone en la cola de espera wait del objeto
                this.wait();
        }catch(InterruptedException e){}

        //incrementa en 1 simulando que guarda un cuadro
        cuadros++;

        //notifica que se ha producido el evento 'pintado y guardado un cuadro'
        System.out.println("Pintado cuadro: "+ cuadros);
        this.notify();
    }

    public synchronized void sacar(){

        try{
            //mientras no haya cuadros hay que esperar
            while(cuadros ==0)
                //el hilo invoca wait() y se pone en la cola de espera wait del objeto
                this.wait();
        }catch(InterruptedException e){}

        //decrementa 1 simulando que vende un cuadro
        cuadros--;

        //notifica que se ha producido el evento 'vendido y sacado un cuadro'
        System.out.println("Vendido cuadro: "+ cuadros);
        this.notify();
    }
    
} // fin clase AlmacenCuadros
