/**Ejercicio40 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio40 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int alturaIntroducida = s.nextInt();
    int altura = 1;
    int espacios = alturaIntroducida - 2;
    while ((alturaIntroducida < 3)||((alturaIntroducida%2)==0)) {
      System.out.println("Introduzca la altura: ");
      alturaIntroducida = s.nextInt();
      int x = 0;
    }
    for (int i = 0; i < alturaIntroducida - 2; ++i) {
      System.out.println();
      for (int j = 0; j < espacios; ++j) {
        System.out.print(" ");
      }
      for (int x = 0; x < altura; ++x) {
        System.out.print("*");
      }
    --espacios;
    ++altura;
    }
  }
}
      
