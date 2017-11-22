
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int[10];
    for (int i = 0; i < 10; ++i) {
      System.out.print("Introduce un número entero: ");
      num[i] = s.nextInt();
    }
    for (int i = 9; i >= 0; --i) {
      System.out.print(" " + num[i] + " ");
    }
  }
}