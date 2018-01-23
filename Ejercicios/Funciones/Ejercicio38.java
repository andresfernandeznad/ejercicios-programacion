
package funciones;


import java.util.Scanner;

import funciones.array1Dim.Array1Dim;

import funciones.matematicas.Matematicas;


/**
 *
 * @author andrésfernándeznadales
 */
public class Ejercicio38 {

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
    System.out.println("Su array con números capicuos es: ");
    Array1Dim.mostrarArrayInt(filtraCapicuas(array));
  }
  


//FUNCIONES//

/**
 * Devuelve un array con todos los números capicúos que
 * se encuentren en otro array
 * 
 * 
 * @param x array que se pasa como parámetro
 * @return Devuelve un array sólo formado por los números capicuos
 */
  public static int[] filtraCapicuas(int x[]) {
    int [] capicua = new int [x.length];
    int contador = 0;
    for (int i = 0; i < x.length; i++) {
      if (Matematicas.esCapicua(x[i])) {
        capicua[contador] = x[i];
        ++contador;
      }
    }
    if (contador == 0) {
      capicua[0] = -1;
    }
    return capicua;
  }
}