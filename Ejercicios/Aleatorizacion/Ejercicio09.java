/**Ejercicio09 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = (int)(Math.random() * 101);
    int contador = 0;
    if ((numero % 2) == 0) {
      contador++;
    }
    while (numero != 24) {
      numero = (int)(Math.random() * 101);
      if ((numero % 2) == 0) {
      contador++;
      }
    }
    System.out.print("Se han generado " + contador + " números.");
  }
}
