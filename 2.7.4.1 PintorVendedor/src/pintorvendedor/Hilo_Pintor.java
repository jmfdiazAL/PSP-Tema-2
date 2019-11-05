/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pintorvendedor;

public class Hilo_Pintor extends Thread{
     private AlmacenCuadros almacen;

    //constructor
    public Hilo_Pintor(AlmacenCuadros a) {
        almacen = a;
    }

    //pinta y guarda en almacén 30 cuadros
    public void run() {
        for (int i = 1; i < 30; i++)
            almacen.guardar();
    }
}
