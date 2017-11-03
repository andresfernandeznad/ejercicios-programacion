/**Ejercicio06 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numeroInt = s.nextInt();
    int numeroCla = (int)(Math.random() * 99);
    int contador = 4;
    while (((contador > 0) && (numeroInt != numeroCla))) {
      System.out.println("Te quedan: " + contador + " intentos.");
      if (numeroInt > numeroCla) {
        System.out.println("Su número es mayor.");
      } else {
        System.out.println("Su número es menor.");
      }
      System.out.print("Vuelve a introducir un número: ");
      numeroInt = s.nextInt();
      contador--;
    }
    if (numeroCla == numeroInt) {
      System.out.print("Enhorabuena! Has acertado!!");
    } else {
      System.out.print("Lo siento no hay mas oportunidades, la solución era: ");
      System.out.print(numeroCla);
    }
  }
}
