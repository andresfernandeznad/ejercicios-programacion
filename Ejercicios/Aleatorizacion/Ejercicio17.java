/**Ejercicio17 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura: ");
    int altura = s.nextInt();
    System.out.print("Introduce la anchura: ");
    int anchura = s.nextInt();
    int alturaAle = (int)(Math.random() * (altura-2));
    int anchuraAle = (int)(Math.random() * (anchura-2));
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 0; i < altura - 2; i++) {
      System.out.print("*");
      for (int j = 0; j < anchura - 2; ++j) {
        if ((i == alturaAle)&&(j == anchuraAle)) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("*");
    }
    for (int i = 0; i < anchura; i++) {
      System.out.print("*");
    }
  }
}
