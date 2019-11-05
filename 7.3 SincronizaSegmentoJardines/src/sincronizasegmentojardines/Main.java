/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sincronizasegmentojardines;

// @author IMCG
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin();
        //crea un objeto RecursoJardín

        for (int i = 1; i <= 10; i++) {
            (new Entra_Jardin("Entra" + i, jardin)).start();
        }//crea e inicia 10 hilos que simulan entrada al jardín

        for (int i = 1; i <= 15; i++) {
            (new Sale_Jardin("Sale" + i, jardin)).start();
        }//crea e inicia 15 hilos que simulan salida del jardín
    }
}

