/**Ejercicio05 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 50; ++i) {
      System.out.print(((int)(Math.random() * 100) + 100) + " ");
    }
  }
}
