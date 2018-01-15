
package funciones;

import java.util.Scanner;

import funciones.array1Dim.Array1Dim;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio20a28 {

  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el tamaño del array: ");
    int n = s.nextInt();
    System.out.print("Introduce el valor mínimo del array: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el valor máximo del array: ");
    int maximo = s.nextInt();
    
    int [] x;
    x = Array1Dim.generaArrayInt(n, minimo, maximo);
    
    System.out.println();
    System.out.println("El valor mínimo del array es: " + Array1Dim.minimoArrayInt(x));
    System.out.println("El valor máximo del array es: " + Array1Dim.maximoArrayInt(x));
    System.out.println("La media de este array es: " + Array1Dim.mediaArrayInt(x));
    
    System.out.print("Introduce el número que quiere comprobar si está: ");
    int numero = s.nextInt();
    System.out.println("¿Está en el array? " + Array1Dim.estaEnArrayInt(x, numero));
  }
  
}
