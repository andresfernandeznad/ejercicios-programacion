/**Ejercicio14 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numeroCla = s.nextInt();
    int numeroPen = (int)(Math.random() * 99);
    int contador = 4;
    while (((contador > 0) && (numeroPen != numeroCla))) {
      System.out.println("Te quedan: " + contador + " intentos.");
      if (numeroPen > numeroCla) {
        System.out.println("Su número pensado es mayor: " + numeroPen);
      } else {
        System.out.println("Su número pensado es menor: " + numeroPen);
      }

      numeroPen = (int)(Math.random() * 99);
      contador--;
    }
    if (numeroCla == numeroPen) {
      System.out.print("Enhorabuena! Has acertado!!");
    } else {
      System.out.print("Lo siento no hay mas oportunidades, la solución era: ");
      System.out.print(numeroCla);
    }
  }
}
