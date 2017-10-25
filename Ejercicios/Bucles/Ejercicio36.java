/**Ejercicio36 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio36 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número ");
    int numero = s.nextInt();
    int volteado = 0;
    int copia = numero;
    while (numero > 0) {
      if (numero < 10) {
        System.out.println("Su número es capicuo.");
      }
      volteado = (numero%10) + (volteado * 10);
      numero /= 10;
      if (volteado == numero) {
        System.out.print("Su número es capicuo.");
      }
    }
  }
}
