
package funciones;

import java.util.Scanner;

import funciones.arrayBiDim.ArrayBiDim;

import funciones.array1Dim.Array1Dim;

/**
 *
 * @author andresfernándeznadales
 */
public class Ejercicio29a34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el número de filas: ");
    int n = s.nextInt();
    System.out.print("Introduce el número de columnas: ");
    int m = s.nextInt();
    System.out.print("Ahora introduce el valor mínimo: ");
    int minimo = s.nextInt();
    System.out.print("Ahora introduce el valor máximo: ");
    int maximo = s.nextInt();
    int [][] x = ArrayBiDim.generaArrayBiInt(n, m, minimo, maximo); //1
    ArrayBiDim.mostrarArrayBiInt(x);
    
    System.out.print("Introduce la fila que quiere mostrar: ");
    int fila = s.nextInt();
    int [] array = ArrayBiDim.filaDeArrayBiInt(x, fila);
    Array1Dim.mostrarArrayInt(array);                               //2
    System.out.println();
    
    System.out.print("Introduce la columna que quiere mostrar: ");
    int columna = s.nextInt();
    array = ArrayBiDim.columnaDeArrayBiInt(x, columna);
    Array1Dim.mostrarArrayInt(array);                               //3               
    System.out.println();
    
    System.out.print("Introduce el número que quiere buscar en el array: ");
    int numero = s.nextInt();
    System.out.println();
    array = ArrayBiDim.coordenadasEnArrayBiInt(x, numero);
    
    System.out.println("Su número está en la posición: ");          //4
    Array1Dim.mostrarArrayInt(array);
    System.out.println();
    System.out.println("Su número es punto de silla? " + ArrayBiDim.esPuntoDeSilla(x, numero));  //5
    
    System.out.print("Introduce la fila desde donde se coge la diagonal: ");
    fila = s.nextInt();
    System.out.print("Introduce la columna desde donde se coge la diagonal: ");
    columna = s.nextInt();
    System.out.print("Introduce la dirección: 'nose' o 'neso'");
    String direccion = s.next();
    array = ArrayBiDim.diagonal(x, fila, columna, direccion);        //6
    Array1Dim.mostrarArrayInt(array);
  }
  
}
