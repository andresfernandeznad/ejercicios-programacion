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
    int espacios = altura - 2;
    int ancho = 0;
    while ((altura < 3)||((altura%2)==0)) {
      System.out.println("Introduzca la altura: ");
      altura = s.nextInt();
      int x = 0;
    }
    for (int i = 0; i < altura; ++i) {
      System.out.println();
      for (int j = 0; j < espacios; ++j) {
        if ((j < altura)&&(j > 0)) {
          System.out.print(" ");
        }
      }
      for (int x = 0; x <= ancho; ++x) {
          System.out.print("*");
      }
      espacios -= 2;
      ancho += 1;
    }
  }
}
