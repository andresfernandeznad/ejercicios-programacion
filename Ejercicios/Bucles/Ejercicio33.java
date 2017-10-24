/**Ejercicio33 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio33 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    for (int i = 0; i < altura; ++i) {
      System.out.println();
      for (int j = 0; j < altura; ++j) {
        if ((i < altura - 1)&&(((j==0)||(j==altura - 1)))) {
          System.out.print("*");
        }
        if ((i < altura - 1)&&((j > 0)&&(j <= altura - 2))) {
          System.out.print(" ");
        }
        if ((i == altura - 1)&&(j==0)) {
          System.out.print(" ");
        }
        
        if ((i == altura - 1)&&((j > 0)&&(j < altura - 1))) {
          System.out.print("*");
        }
      }
    }
  } 
}
