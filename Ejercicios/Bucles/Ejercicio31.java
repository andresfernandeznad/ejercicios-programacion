/**Ejercicio31 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio31 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la L: ");
    int altura = s.nextInt();
    int horizontal = ((altura/2) + 1);
    int i = 1;
    while (i < altura) {
      System.out.println("*");
      ++i;
    }
    while (horizontal > 0) {
      System.out.print("*");
      --horizontal;
    }
  }
}
