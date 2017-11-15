/**Ejercicio22 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int posicion = 0;
    System.out.print("Introduzca la longitud de la serpiente: ");
    int longitud = s.nextInt();
    int posicionFinal = 12;
    System.out.println("            @");
    for (int i = 1; i < longitud; i++) {
      posicion = (int)(Math.random() * 3) - 1;
      posicionFinal += posicion;
      for (int j = 0; j < posicionFinal; ++j) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
  }
}
