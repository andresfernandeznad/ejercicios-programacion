
package arraybidimensional;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [][] matriz = new int [12][12];
    int [][] rotada = new int [12][12];
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        matriz [i][j] = (int)(Math.random()*100);
        System.out.printf("%-4d", matriz[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    rotada[0][0] = matriz [11][11];
    for (int i = 0; i < 12; i++) {
      if (i >= 1) {
        rotada[i][0] = matriz [i - 1][11];
      }
      for (int j = 0; j < 11; j++) {
        rotada [i][j + 1] = matriz [i][j];
        System.out.printf("%-4d", rotada[i][j]);
      }
      System.out.printf("%-4d", rotada[i][11]);
      System.out.println();
    }
  }
  
}
