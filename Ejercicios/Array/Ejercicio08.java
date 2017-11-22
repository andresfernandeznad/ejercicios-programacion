
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] mes = new int [12];
    for (int i = 0; i < 12; ++i) {
      System.out.print("Introduce la temperatura: ");
      mes [i] = s.nextInt(); 
    }
    for (int i = 0; i < 12; ++i) {
      System.out.print("Mes " + (i+1) + ": ");
      for (int j = 0; j < mes[i]; ++j) {
        System.out.print("█");
      }
      System.out.println();
    }
  }
}