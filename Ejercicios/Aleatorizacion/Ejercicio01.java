/**Ejercicio01 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int suma = 0;
    for (int i = 0; i < 3; i++) {
      int tirada = 0;
      tirada = (int)(Math.random() * 6) + 1;
      System.out.println("Su tirada es: " + tirada);
      suma += tirada;
    }
    System.out.println("Su suma total es: " + suma);
  }
}
