/**Ejercicio08 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    for (int i = 1; i < 16; i++) {
      System.out.print("Partido " + i + " - ||");
      for (int j = 0; j < 3; ++j) {
        int valor = (int)(Math.random() * 6);
        switch (valor) {
          case 0:
            System.out.print("1");
            break;
          case 1:
            System.out.print("1");
            break;
          case 2:
            System.out.print("1");
            break;
          case 3:
            System.out.print("X");
            break;
          case 4:
            System.out.print("X");
            break;
          case 5:
            System.out.print("2");
            break;
        }
        System.out.print("||");
      }
      System.out.println();
    }
  }
}
