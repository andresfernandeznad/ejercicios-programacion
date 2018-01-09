
package funciones;

/**
 *
 * @author andrésfernándeznadales
 */

import matematicas.Matematicas;

public class Ejercicio15 {

  public static void main(String[] args) {
    for (int i = 1; i < 1000; i++) {
      if (matematicas.Matematicas.esPrimo(i) == true) {
        System.out.print(" " + i + " ");
      }
    }
  }
  
}
