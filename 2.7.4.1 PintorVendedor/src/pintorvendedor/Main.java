/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pintorvendedor;

public class Main {
    public static void main(String[] args) {

       //recurso compartido por los hilos, el almacén
       AlmacenCuadros almacen= new AlmacenCuadros();

       //se crean los hilos
       Hilo_Pintor pintor=new Hilo_Pintor(almacen);
       Hilo_Vendedor vendedor=new Hilo_Vendedor(almacen);

       //se inician los hilos
       pintor.start();
       vendedor.start();

    }
} // fin clase Main
