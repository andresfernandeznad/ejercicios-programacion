/**Ejercicio19 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int numero = (int)(Math.random()*301) - 100;
    int mayor = 0;
    int menor = 0;
    int suma = 0;
    for (int i = 0; i < 50; i++) {
      numero = (int)(Math.random()*301) - 100;
      System.out.print(" " + numero);
      if (((numero % 2 )== 0)&&(numero > mayor)) {
        mayor = numero;
      }
      if (((numero % 2 )!= 0)&&(numero < menor)) {
        menor = numero;
      }
      suma += numero;
    }
    System.out.println();
    System.out.println("El mayor de los pares es: " + mayor);
    System.out.println("El menor de los impares es: " + menor);
    System.out.println("La media de todos los números es: " + (suma/50));
  }
}
