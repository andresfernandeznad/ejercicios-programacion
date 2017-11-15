/**Ejercicio22 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int espacios = 13;
    int posicion = (int)(Math.random() * 3) - 1;
    System.out.print("Introduzca la longitud de la serpiente: ");
    int longitud = s.nextInt();
    System.out.println("            @");
    for (int i = 1; i < longitud; i++) {
      posicion = (int)(Math.random() * 3) - 1;
      posicion = posicion + 12;
      for (int j = 0; j < posicion; ++j) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
