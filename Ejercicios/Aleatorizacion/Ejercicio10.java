/**Ejercicio10 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 10; ++i) {
      int contador = (int)(Math.random() * 6);
      switch (contador) {
        case 0:
          int silabas = (int)((Math.random() * 40) + 1);
          for (int j = 0; j < silabas; ++j) {
            System.out.print("*");
          }
          break;
        case 1:
          silabas = (int)((Math.random() * 40) + 1);
          for (int j = 0; j < silabas; ++j) {
            System.out.print("-");
          }
          break;
        case 2:
          silabas = (int)((Math.random() * 40) + 1);
          for (int j = 0; j < silabas; ++j) {
            System.out.print("=");
          }
          break;
        case 3:
          silabas = (int)((Math.random() * 40) + 1);
          for (int j = 0; j < silabas; ++j) {
            System.out.print("|");
          }
          break;
        case 4:
          silabas = (int)((Math.random() * 40) + 1);
          for (int j = 0; j < silabas; ++j) {
            System.out.print(".");
          }
          break;
        case 5:
          silabas = (int)((Math.random() * 40) + 1);
          for (int j = 0; j < silabas; ++j) {
            System.out.print("@");
          }
          break;
      }
      
      System.out.println();
    }
  }
}
