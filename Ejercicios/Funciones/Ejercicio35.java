
package funciones;

import java.util.Scanner;

import funciones.matematicas.Matematicas;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio35 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el número que quiere pasar a palotes: ");
    int numero = s.nextInt();
    System.out.println(convierteEnPalotes(numero));
  }
  


//FUNCIONES//

/**
 * Esta función convierte el número n al sistema de palotes
 * y lo devuelve en una cadena de caracteres
 * 
 * 
 * @param n el número que se pasa a palotes.
 * @return Devuelve un string del numero que se pasa a palotes.
 */
  public static String convierteEnPalotes(int n) {
    String palotes = "";
    n = Matematicas.voltea(n);
    
    int resto = 0;
    while (n > 0) {
      resto = n % 10;
      for (int i = 0; i < resto; i++) {
        palotes += "|";
      }
      n /= 10;
      palotes += "-";
    }
    palotes = palotes.substring(0, palotes.length() - 1);
    return palotes;
  }
}