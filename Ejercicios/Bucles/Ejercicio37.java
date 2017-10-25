/**Ejercicio37 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numero = s.nextInt();
    int volteado = 0;
    int copia = numero;
    while (numero > 0) {
      volteado = (numero % 10) + (volteado * 10);
      numero /= 10;
    }
    System.out.print("Su número: " + copia + " en el sistema de palotes es: ");
    while (volteado > 0) {
      int resto = 0;
      resto = volteado % 10;
      for (int i = 0; i < resto; ++i) {
        System.out.print("|");
      }
      System.out.print("   ");
      volteado /= 10;
    }
  }
}
