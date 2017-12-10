
package arraybidimensional;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [][] num = new int [4][5];
    int sumaFila = 0;
    int copia1 = 0;
    int sumaCol = 0;
    int copia2 = 0;
    for (int i = 0; i < 4; ++i) {
      for (int j = 0; j < 5; ++j) {
        num [i][j] = (int)(Math.random()*100);
        sumaFila += num [i][j]; 
        System.out.print(num[i][j] + " ");
      }
      System.out.print(" || " + sumaFila);
      copia1 += sumaFila;
      sumaFila = 0;
      System.out.println();
    }
    
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 4; ++j) {
        sumaCol += num [j][i]; 
      }
      System.out.print(sumaCol + " ");
      copia2 += sumaCol;
      sumaCol = 0;
      
    }
    System.out.print(copia1 + "/" + copia2);
  }
  
}
