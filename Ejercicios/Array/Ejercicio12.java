
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int[10];
    
    
    for (int i = 0; i < 10; ++i) {
      System.out.print("Introduce un número: ");
      num[i] = s.nextInt();
    }
    System.out.print("Introduce la posición inicial: ");
    int inicial = s.nextInt();
    System.out.print("Introduce la posición final: ");
    int finalPos = s.nextInt();
    while ((((inicial >= finalPos)&&(inicial>9))||(inicial<0)||(finalPos>9)||(finalPos<0))) {
      System.out.print("Introduce la posición inicial: ");
      inicial = s.nextInt();
      System.out.print("Introduce la posición final: ");
       finalPos = s.nextInt();
    }
    System.out.print(num[9] + " ");
    for (int i = 0; i < inicial; ++i) {
      System.out.print(num[i] + " ");
    }
    for (int i = inicial + 2; i <= finalPos; ++i) {
      System.out.print(num[i - 1] + " ");
    }
    System.out.print(num[inicial] + " ");
    for (int i = finalPos; i < 9; i++) {
      System.out.print(num[i] + " ");
    }
  }
}