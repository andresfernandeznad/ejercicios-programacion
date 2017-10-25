/**Ejercicio35 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    while ((altura < 3)||((altura%2)==0)) {
      System.out.println("Introduzca la altura: ");
      altura = s.nextInt();
      int x = 0;
    }
    for (int i = 1; i <= altura; ++i) {
      System.out.println();
      for (int j = 1; j <= altura; ++j) {
        if ((j < i)&&(i > 1)) {
          System.out.print(" ");
        }
        if (j==i) {
          System.out.print("*");
        }
        if ((j > i)&&(j < altura)) {
          System.out.print(" ");
        }
        if ((j == altura)&&(i == 1)) {
          System.out.print("*");
        }
      }
    }
  }
}
