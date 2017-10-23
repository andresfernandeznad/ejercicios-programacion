/**Ejercicio27 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio27 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número límite: ");
    int limite = s.nextInt();
    int i = 0;
    int j = 0;
    int suma = 0;
    while (i <= limite) {
      System.out.print(i + ", ");
      suma += i;
      i += 3 ;
      ++j;
    }
    System.out.println("Hay: " + j + " números.");
    System.out.println("La suma de estos números es: " + suma);
  }
}
      
