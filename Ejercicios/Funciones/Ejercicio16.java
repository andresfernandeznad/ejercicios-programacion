
package funciones;

/**
 *
 * @author andrésfernándeznadales
 */

import matematicas.Matematicas;

public class Ejercicio16 {

  public static void main(String[] args) {
    for (int i = 1; i < 100000; i++) {
      if (matematicas.Matematicas.esCapicua(i) == true) {
        System.out.print(" " + i + " ");
      }
    }
  }
  
}
