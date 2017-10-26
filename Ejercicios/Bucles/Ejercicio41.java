/**Ejercicio41 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio41 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numero = s.nextInt();
    int contadorPar = 0;
    int contadorImpar = 0;
    int copia = numero;
    int resto = 0;
    while (numero > 0) {
      resto = numero % 10;
      if ((resto%2)==0) {
        ++contadorPar;
      } else if ((resto%2)!=0) {
        ++contadorImpar;
      }
      numero /= 10;
    }
    System.out.println("Su número: " + copia + " tiene " + contadorPar + " números pares.");
    System.out.println("Su número: " + copia + " tiene " + contadorImpar + " números impares.");
  }
}
