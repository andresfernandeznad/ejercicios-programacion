
package funciones;

import java.util.Scanner;

import funciones.matematicas.Matematicas;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio39 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    System.out.println("Su número en palabras es: ");
    System.out.println(convierteEnPalabras(numero));
  }
  


//FUNCIONES//

/**
 * Convierte los dígitos del número en una 
 * cadena String
 * 
 * 
 * @param n un numero entero
 * @return Devuelve el número en cadena de caracteres
 */
  public static String convierteEnPalabras(int n) {
    String [] palabras = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
    
    String convertido = "";
    n = Matematicas.voltea(n);
    
    while (n > 0) {
      convertido += palabras[n%10];
      convertido += ", ";
      n /= 10;
    }
    convertido = convertido.substring(0, convertido.length() - 2);
    return convertido;
  }
}