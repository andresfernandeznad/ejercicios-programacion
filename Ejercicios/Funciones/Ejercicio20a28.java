
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
    Array1Dim.mostrarArrayInt(x);
    System.out.println();
    System.out.println();
    System.out.println("El valor mínimo del array es: " + Array1Dim.minimoArrayInt(x));
    System.out.println("El valor máximo del array es: " + Array1Dim.maximoArrayInt(x));
    System.out.println("La media de este array es: " + Array1Dim.mediaArrayInt(x));
    
    System.out.print("Introduce el número que quiere comprobar si está: ");
    int numero = s.nextInt();
    System.out.println("¿Está en el array? " + Array1Dim.estaEnArrayInt(x, numero));
    
    System.out.print("Introduce el número que quieres buscar: ");
    numero = s.nextInt();
    System.out.println("Su número está en la posición: " + Array1Dim.posicionEnArray(x, numero));
    System.out.println("Su array volteado es: ");
    Array1Dim.volteaArrayInt(x);
    System.out.println();
    System.out.println("Introduce el número de posiciones que quieres que rote: ");
    int rotaDer = s.nextInt();
    System.out.println("El nuevo array rotado a la derecha es: ");
    int [] rotado;
    rotado = Array1Dim.rotaDerechaArrayInt(x, rotaDer);
    for (int i = 0; i < rotado.length - 1; ++i) {
      System.out.print(rotado[i] + " ");
    }
    System.out.println();
    System.out.println("Introduce el número de posiciones que quieres que rote: ");
    int rotaIzq = s.nextInt();
    System.out.println("El nuevo array rotado a la izquierda es: ");
    rotado = Array1Dim.rotaIzquierdaArrayInt(x, rotaIzq);
    for (int i = 0; i < rotado.length - 1; ++i) {
      System.out.print(rotado[i] + " ");
    }
    System.out.println();
  }
}
