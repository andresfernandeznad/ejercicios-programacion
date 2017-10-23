/**Ejercicio26 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio26 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    System.out.print("Introduce un dígito del número introducido anteriormente: ");
    int digito = s.nextInt();
    int resto;
    int i = 0;
    while (numero > 0) {
      resto = numero % 10;
      numero = numero / 10;
      ++i;
      if (resto == digito) {
        System.out.print("Su número está en la posición: " + i);
      }
    }
  }
}
