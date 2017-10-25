/**Ejercicio39 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero y positivo: ");
    int numero = s.nextInt();
    int factorial = 1;
    int i = 1;
    while (i <= numero) {
      for (int j = 1; j <= i; ++j) {
        factorial *= j;
      }
      System.out.println(i + "! = " + factorial);
      factorial = 1;
      ++i;
    }
  }
}
