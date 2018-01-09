
package funciones;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;
import matematicas.Matematicas;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número que quieres pasar a decimal: ");
    int numero = s.nextInt();
    int suma = 0;
    
    int copia = numero;
    int resto = 0;
    for (int i = 0; i < matematicas.Matematicas.digitos(copia); ++i) {
      resto = numero % 10;
      
      suma += ((matematicas.Matematicas.potencia(2, i)) * resto);
      numero /= 10;
    }
    System.out.println("Su número en decimal es: " + suma);
  }
  
}
