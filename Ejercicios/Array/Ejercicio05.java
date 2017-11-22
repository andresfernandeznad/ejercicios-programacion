
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numero = new int [10];
     System.out.print("Introduce un número: ");
     numero [0] = s.nextInt();
     int mayor = 0;
     int menor = numero[0];
     if (numero[0] > mayor) {
      mayor = numero[0];
    }
   
    
    for (int i = 1; i < 10; ++i) {
      System.out.print("Introduce un número: ");
      numero [i] = s.nextInt();
      if (numero[i] > mayor) {
        mayor = numero[i];
      }
      if (numero[i] < menor) {
        menor = numero[i];
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(" " + numero[i] + " ");
      if (numero[i] == menor) {
        System.out.print(" - minimo");
      }
      if (numero[i] == mayor) {
        System.out.print(" - maximo");
      }
    }
    
  }
}