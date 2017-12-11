
package arraybidimensional;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [][] num = new int [6][10];
    int minimo = 1000;
    int maximo = 0;
    int aux1 = 0;
    int aux2 = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        
        num[i][j] = (int)(Math.random()*1000);
        
        while ((num[i][j] == num[aux1][aux2]) && (aux1 < 5) && (aux2 < 9)) {
          num[i][j] = (int)(Math.random()*1000);
          ++aux1;
          ++aux2;
        }
        aux1 = 0;
        aux2 = 0;
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
