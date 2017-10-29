/**Ejercicio43 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio43 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    int posicion = s.nextInt();
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (numero % 10) + (volteado * 10);
      numero /= 10;
    }
    
    int i = 0;
    int resto = 0;
    System.out.print("Los numeros partidos son ");
    while (i < posicion - 1) {
      resto = volteado % 10;
      ++i;
      volteado /= 10;
      System.out.print(resto);
    }
    numero = 0;
    while (volteado > 0) {
      numero = (volteado % 10) + (numero * 10);
      volteado /= 10;
    }
    System.out.print(" y " + numero);
  }
}
