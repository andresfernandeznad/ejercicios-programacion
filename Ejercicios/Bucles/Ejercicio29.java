/**Ejercicio29 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio29 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número principal: ");
    int numero = s.nextInt();
    System.out.print("Introduce el divisor de los números que no");
    System.out.print(" quieres mostrar: ");
    int divisor = s.nextInt();
    while (numero > 0) {
      if ((numero % divisor) != 0) {
        System.out.print(numero + ", ");
      }
      --numero;
    }
  }
}
