
package arraybidimensional;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int maximo = 200;
    int minimo = 300;
    int suma = 0;
    int [][] num = new int [10][10];
    int [] aux = new int [10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        num [i][j] = (int)(Math.random()*100) + 200;
        System.out.printf("%-4d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    for (int i = 0; i < 10; i++) {
      aux [i] = num[i][i];
      suma += aux [i];
      if (maximo < aux[i]) {
        maximo = aux[i];
      }
      if (minimo > aux[i]) {
        minimo = aux[i];
      }
      System.out.print(aux[i] + " ");
    }
    System.out.println();
    System.out.println("El máximo es: " + maximo);
    System.out.println("El mínimo es: " + minimo);
    System.out.println("La media es: " + (suma/10));
  }
  
}
