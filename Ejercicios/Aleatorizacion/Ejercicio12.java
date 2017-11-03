/**Ejercicio12 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    char valor;
    String verde = "\033[32m";
    for (int i = 1; i > 0; ++i) {
      valor = (char)((int)((Math.random() * 95) + 32));
      System.out.print(verde + valor);
    }
  }
}
