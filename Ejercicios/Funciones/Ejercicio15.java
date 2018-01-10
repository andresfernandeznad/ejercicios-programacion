
package funciones;

/**
 *
 * @author andrésfernándeznadales
 */

import funciones.matematicas.Matematicas;

public class Ejercicio15 {

  public static void main(String[] args) {
    for (int i = 1; i < 1000; i++) {
      if (Matematicas.esPrimo(i) == true) {
        System.out.print(" " + i + " ");
      }
    }
  }
  
}
