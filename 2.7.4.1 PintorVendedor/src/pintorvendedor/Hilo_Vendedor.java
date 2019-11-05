/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pintorvendedor;

public class Hilo_Vendedor extends Thread {
    private AlmacenCuadros almacen;
    //constructor
    public Hilo_Vendedor(AlmacenCuadros a) {
        almacen = a;
    }

    //vende (saca) del almacén 30 cuadros
    public void run() {
        for (int i = 1; i < 30; i++)
            almacen.sacar();
    }
}
