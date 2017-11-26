
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] num = new int[10];
    int [] primo = new int [10];
    int [] noPrimo = new int [10];
    int contadorPrimo = 0;
    int contadorNoprimo = 0;
    for (int i = 0; i < 10; ++i) {
      System.out.print("Introduce un número: ");
      num[i] = s.nextInt();
      int j = 2;
      while (num[i]%j != 0) {
        ++j;
      }
      if (num[i]==j) {
        primo[contadorPrimo] = num[i];
        contadorPrimo++;
      } else {
        noPrimo [contadorNoprimo] = num [i];
        contadorNoprimo++;
      }
     } 
    System.out.println();
    for (int i = 0; i < 10; i++) {
      System.out.print("Indice: " + i + " = numero: " + num[i]);
    }
    System.out.println();
    for (int i = 0; i < contadorPrimo; ++i) {
      System.out.print(primo[i] + " primo ");
    }
    for (int i = 0; i < contadorNoprimo; ++i) {
      System.out.print(noPrimo[i] + " no primo");
    }
  }
 }