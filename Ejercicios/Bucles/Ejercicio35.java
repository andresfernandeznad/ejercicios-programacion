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
    for (int i = 0; i < altura; ++i) {
      System.out.println();
      for (int j = 0; j < altura; ++j) {
        if ((i < altura - 1)&&(((j==0)||(j==altura - 1)))) {
          System.out.print("*");
        }
        if ((j > 0)&&(j <= altura - 2)) {
          System.out.print(" ");
        }
        if ((i == altura - 1)&&((j > 0)&&(j < altura - 1))) {
          System.out.print("*");
        }
      }
    }
  } 
}
