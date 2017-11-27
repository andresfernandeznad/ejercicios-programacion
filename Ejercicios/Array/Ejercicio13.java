
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int [100];
    
    for (int i = 0; i < 100; ++i) {
      num[i] = (int)(Math.random()*501);
      System.out.print(num[i] + " ");
    }
    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int peticion = s.nextInt();
    int mayor = 0;
    int menor = 500;
    if (peticion == 1) {
      for (int i = 0; i < 100; i++) {
        if (num[i] < menor) {
          menor = num[i];
        }
      }
      for (int i = 0; i <100; i++) {
        if (num[i] == menor) {
          System.out.print(" **" + num[i] + "** ");
        } else {
          System.out.print(num[i] + " ");
        }
      }
    }
       if (peticion == 2) {
      for (int i = 0; i < 100; i++) {
        if (num[i] > mayor) {
          mayor = num[i];
        }
      }
      for (int i = 0; i <100; i++) {
        if (num[i] == mayor) {
          System.out.print(" **" + num[i] + "** ");
        } else {
          System.out.print(num[i] + " ");
        }
      }
    }
  }
}