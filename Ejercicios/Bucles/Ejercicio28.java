/**Ejercicio28 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para calcular el factorial: ");
    int numero = s.nextInt();
    int numeroMostrado = numero;
    int multiplicacion = 1;
    while (numero > 0) {
      multiplicacion *= numero;
      --numero;
    }
    System.out.print(numeroMostrado + "! = " + multiplicacion);
  }
}
