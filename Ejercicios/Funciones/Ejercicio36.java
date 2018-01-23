
package funciones;

import java.util.Scanner;

import funciones.matematicas.Matematicas;

import funciones.array1Dim.Array1Dim;

/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio36 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el valor mínimo del array: ");
    int minimo = s.nextInt();
    System.out.print("Introduce el valor máximo del array: ");
    int maximo = s.nextInt();
    System.out.print("Introduce el tamaño del array: ");
    int tamanyo = s.nextInt();
    int [] array = Array1Dim.generaArrayInt(tamanyo, minimo, maximo);
    Array1Dim.mostrarArrayInt(array);
    System.out.println();
    System.out.println("Su array con números primos es: ");
    Array1Dim.mostrarArrayInt(filtraPrimos(array));
  }
  


//FUNCIONES//

/**
 * Devuelve un array con todos los números primos que
 * se encuentren en otro array
 * 
 * 
 * @param x un array que queremos buscar los números primos
 * @return Devuelve un array formado solo de los números primos del 
 * array pasado de parámetro
 */
  public static int[] filtraPrimos(int x[]) {
    int [] primo = new int [x.length];
    int contador = 0;
    for (int i = 0; i < x.length; i++) {
      if (Matematicas.esPrimo(x[i])) {
        primo[contador] = x[i];
        ++contador;
      }
    }
    return primo;
  }
}