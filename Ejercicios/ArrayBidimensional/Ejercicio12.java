
package arraybidimensional;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int maximo = 500;
    int minimo = 900;
    int suma = 0;
    int [][] num = new int [9][9];
    int [] aux = new int [9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        num [i][j] = (int)(Math.random()*400) + 500;
        System.out.printf("%-4d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    int j = -1;
    for (int i = 8; i >= 0; i--) {
      ++j;
      aux [i] = num[i][j];
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
