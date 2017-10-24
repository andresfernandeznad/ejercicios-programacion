/**Ejercicio32 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce desde teclado un número: ");
    int numero = s.nextInt();
    System.out.print("Dígitos pares: ");
    int resto = 0;
    int suma = 0;
    while (numero > 0) {
      resto = numero % 10;
      numero /= 10;
      if (((resto)%2) == 0) {
        System.out.print(resto);
        suma += resto;
      }
    }
    System.out.println();
    System.out.print("Su suma es: " + suma);
  }
}
