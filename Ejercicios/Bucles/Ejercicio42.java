/**Ejercicio42 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio42 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero y positivo: ");
    int numero = s.nextInt();
    int i = 0;
    int j = 2;
    int resto = 0;
    int contadorNoprimo = 0;
    while (i < 5) {
      contadorNoprimo = 0;
      while (j <= numero) {
        resto = numero % j;
        if (resto == 0) {
          ++contadorNoprimo;
        }
        ++j;
      }
      if (contadorNoprimo > 1) {
        System.out.println(numero + " no es primo.");
      } else {
        System.out.println(numero + " es primo.");
      }
      ++numero;
      ++i;
      j = 2;
    }
  }
}
