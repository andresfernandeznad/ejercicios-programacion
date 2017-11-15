/**Ejercicio23 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int cara = 0;
    for (int i = 0; i < 5; ++i) {
      cara = (int)(Math.random() * 6);
      switch (cara) {
        case 0:
          System.out.print("As ");
          break;
        case 1:
          System.out.print("K ");
          break;
        case 2:
          System.out.print("Q ");
          break;
        case 3:
          System.out.print("J ");
          break;
        case 4:
          System.out.print("7 ");
          break;
        case 5:
          System.out.print("8 ");
          break;
      }
    }
  }
}
