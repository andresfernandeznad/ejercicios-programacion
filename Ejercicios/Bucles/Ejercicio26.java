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
    int volteado = 0;
    int restoVolteado = 0;
    while (numero > 0) {
      volteado = (numero % 10) + (volteado * 10);
      numero /= 10;
    }
    while (volteado > 0) {
      resto = volteado % 10;
      volteado = volteado / 10;
      ++i;
      if (resto == digito) {
        System.out.print("Su número está en la posición: " + i);
      }
    }
  }
}
