
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     int [] num = new int [20];
    
    for (int i = 0; i < 20; ++i) {
      num[i] = (int)(Math.random()*401);
      System.out.print(num[i] + " ");
    }
    System.out.print("¿Qué quiere destacar? (1 – múltiplos de 5, 2 – múltiplos de 7): ");
    int peticion = s.nextInt();
    int mult7 = 0;
    int mult5 = 500;
    if (peticion == 1) {
      for (int i = 0; i < 20; i++) {
        if (num[i] % 5 == 0) {
          System.out.print(" [" + num[i] + "] ");
        } else {
          System.out.print(num[i] + " ");
        }
        }
      }
      
    
       if (peticion == 2) {
      for (int i = 0; i < 20; i++) {
        if (num[i] % 7 == 0) {
          System.out.print(" [" + num[i] + "] ");
        } else {
          System.out.print(num[i] + " ");
        }
        }
      }
      
    }
  }
