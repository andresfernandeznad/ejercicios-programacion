
package arraybidimensional;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [][] num = new int [6][10];
    int minimo = 1000;
    int maximo = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        num[i][j] = (int)(Math.random()*1000);
        if (num[i][j] < minimo) {
          minimo = num[i][j];
        }
        if (num[i][j] > maximo) {
          maximo = num[i][j];
        }
      }
    }
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        if (num[i][j] == maximo) {
          System.out.println("Su máximo es: " + maximo + " y está en [" + i +
          "][" + j + "]");
        } else if (num[i][j] == minimo) {
          System.out.println("Su mínimo es: " + minimo + " y está en [" + i +
          "][" + j + "]");
        }
      }
    }
  }
  
}
