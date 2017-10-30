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
    int altura = s.nextInt();
    int espacio = altura - 1;
    for (int i = 1; i <= altura; ++i) {
      for (int j = 0; j < espacio; ++j) {
        System.out.print(" ");
      }
      
      //Pintar primera mitad
      for (int x = 1; x <= i; ++x) {
        System.out.print(x);
      }
      
      //Pintar segunda mitad
      for (int j = i - 1; j > 0; --j) {
        System.out.print(j);
      }
      System.out.println();
      espacio--;
    }
  }
}
