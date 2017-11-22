
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numero = new int[20];
    int [] cuadrado = new int[20];
    int [] cubo = new int[20];
    
    for (int i = 0; i < 20; ++i) {
      numero [i] = (int)(Math.random() * 101);
      cuadrado [i] = numero[i] * numero[i];
      cubo [i] = cuadrado[i] * numero[i];
      System.out.println("|| Número: " + numero[i] + "    || Cuadrado: " + cuadrado[i] + "    || Cubo: " + cubo[i] + " ||");
    }
  }
}