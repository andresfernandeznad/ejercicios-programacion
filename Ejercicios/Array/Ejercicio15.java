
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] mesa = new int [10];
    
    int comensales = 0;
    for (int i = 0; i < 10; i++) {
      mesa [i] = (int)(Math.random() * 4) + 1;
      System.out.print("Mesa: " + (i+1));
      System.out.println(" Comensales: " + mesa[i]);
    }
    while (comensales > -1) {
      System.out.print("¿Cuántos son? ");
      comensales = s.nextInt();
      for (int i = 0; i < 10; i++) {
        if ((mesa[i] + comensales) <= 4) {
          mesa[i] = mesa [i] + comensales;
          i += 10;
        }
      }
      for (int i = 0; i < 10; i++) {
        System.out.print("Mesa: " + (i+1));
        System.out.println(" Comensales: " + mesa[i]);
      }
    }
  }
}