/**Ejercicio24 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura que quiere que tenga la pirámide: ");
    int alturaFinal = s.nextInt();
    int espacios = alturaFinal - 1;
    int ancho = 1;
    for (int i = 1; i <= alturaFinal; ++i) {
      System.out.println();
      for (int j = 1; j <= espacios; ++j) {
        System.out.print(" ");
      }
      for (int x = 1; x <= ancho; ++x) {
        System.out.print(x);
      }
      --espacios;
      ancho += 2;
    }
  }
}
