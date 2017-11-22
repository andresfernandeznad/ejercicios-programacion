
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numero = new int [15];
    int [] numerorot = new int [16];
    for (int i = 0; i < 15; ++i) {
      System.out.print("Introduce un número: ");
      numero [i] = s.nextInt(); 
      numerorot [i+1] = numero [i];
      if ((i + 1) == 15) {
        numerorot [0] = numero [i];
      }
    }
    for (int i = 0; i < 15; ++i) {
      System.out.print("|| " + numerorot[i] + " ||");
    }
  }
}