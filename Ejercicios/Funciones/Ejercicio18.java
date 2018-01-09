
package funciones;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;
import funciones.matematicas.Matematicas;

public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número que quiere pasar a binario: ");
    int numero = s.nextInt();
    int binario = 0;
    int contador = 0;
    int copia = numero;
    while (numero % 2 == 0) {
      contador++;
      numero /= 2;
    }
    
    while (copia > 0) {
      
      binario = (copia % 2) + binario * 10;
      copia /= 2;
    }
    binario = Matematicas.voltea(binario);
    for (int i = 0; i < contador; ++i) {
      binario *= 10;
    }
    
    System.out.println("Su número en binario es: " + binario);
      
    
  }
}