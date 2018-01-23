
package funciones;

import java.util.Scanner;

import funciones.matematicas.Matematicas;


/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio37 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int numero = s.nextInt();
    System.out.println("Su número en morse es: ");
    System.out.println(convierteEnMorse(numero));
  }
  


//FUNCIONES//

/**
 * Convierte el número introducido por parámetro en morse
 * 
 * 
 * @param n número que queremos convertir en morse
 * @return Devuelve la cadenna string que es el número en morse
 */
  public static String convierteEnMorse(int n) {
    String [] morse = {" _ _ _ _ _", " . _ _ _ _", " . . _ _ _", " . . . _ _", " . . . . _", " . . . . .", " _ . . . .", " _ _ . . .", " _ _ _ . .", " _ _ _ _ ."};
    
    String codigo = "";
    int resto = 0;
    n = Matematicas.voltea(n);
    while (n > 0) {
      resto = n % 10;
      codigo += morse[resto];
      n /= 10;
    }
    return codigo;
  }
}