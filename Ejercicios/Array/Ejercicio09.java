
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numero = new int [8];
    
    for(int i = 0; i < 8; i++) {
      System.out.print("Introduce un número: ");
      numero[i] = s.nextInt();
    }
    for (int i = 0; i < 8; i++) {
      if ((numero[i]%2)==0) {
        System.out.print(numero[i] + " --> par ");
      } else {
        System.out.print(numero[i] + " --> impar ");
      }
    }
  }
}