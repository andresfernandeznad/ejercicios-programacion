/**Ejercicio25 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 100; i++) {
      int numero = (int)(Math.random() * 191) + 10;
      int j = 2;
      while (numero % j != 0) {
      ++j;
      }
      if (numero == j) {
        System.out.print("#" + numero + "# ");
      } else if ((numero % 5 )== 0) {
        System.out.print("[" + numero + "] ");
      } else {
        System.out.print(numero + " ");
      }
    }
  }
}
