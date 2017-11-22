
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [] numero = new int [20];
    int [] auxiliar = new int [20];
    int par = 0;
    int impar = 0;
    for (int i = 0; i < 20; i++) {
       numero[i] = (int)((Math.random())*100) + 1;
       
       if ((numero[i]%2)==0) {
        auxiliar[par] = numero[i];
        par++;
       } else {
          numero[impar] = numero [i];
          ++impar;
       }
       
    }
   for (int i = 0; i < par; ++i) {
     System.out.print(auxiliar[i] + " ");
   }
   for (int i = 0; i < impar; ++i) {
     System.out.print(numero[i] + " ");
   }
   
    
   
  }
}