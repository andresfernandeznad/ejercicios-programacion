/**Ejercicio20 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de la cuba: ");
    int altura = s.nextInt();
    int llenado = (int)(Math.random() * altura);
    for (int i = altura; i > 0; --i) {
      System.out.print("*");
      if (i > llenado) {
        for (int j = 0; j < 4; ++j) {
          System.out.print(" ");
        }
      } else {
        for (int j = 0; j < 4; ++j) {
          System.out.print("=");
        }
      }
      System.out.println("*");
    }
    System.out.println("******");
    System.out.print("Su cuba puede contener " + altura + " litros, ");
    System.out.print("y contiene " + llenado + " litro/s.");
  }
}
