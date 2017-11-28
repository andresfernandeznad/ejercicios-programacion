
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int [10];
    int posicion = 0;
    for (int i = 0; i < 10; i++) {
      num [i] = (int)(Math.random() * 101);
      System.out.print(num[i] + " ");
    }
    System.out.print("Introduce un número: ");
    int numeroIntroducido = s.nextInt();
    for (int i = 0; i < 10; i++) {
      if (numeroIntroducido == num [i]) {
        System.out.print("Su número está en el array.");
        posicion = i;
      }
    }
    for (int i = posicion; i < 10; ++i) {
      System.out.print(num[i]+ " ");
    }
    for (int i = 0; i < posicion; ++i) {
      System.out.print(num[i] + " ");
    }
  }
}