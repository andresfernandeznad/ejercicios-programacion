
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numero = new int [100];
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)(Math.random() * 21);
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.print("Introduce el primer valor: ");
    int valorPrimero = s.nextInt();
    System.out.print("Introduce el segundo valor: ");
    int valorSegundo = s.nextInt();
    System.out.println();
    
    for (int i = 0; i < 100; ++i) {
      if (numero[i] == valorPrimero) {
        numero[i] = valorSegundo;
      }
      if (numero [i] != valorSegundo) {
        System.out.print(numero[i] + " ");
      } else {
        System.out.print(" ' " + numero[i] + " ' ");
      }
    }
  }
}