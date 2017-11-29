
package arrays;

/**
 *
 * @author andrésfernándeznadales
 */

import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String [] palabra = new String [8];
    int contador = 0;
    int x = 0;
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduzca ocho palabras: ");
      palabra [i] = s.next();
    }
    String [] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado", " "};
    String [] aux = new String [8];
    for (int i = 0; i < 8; ++i) {
      for (int j = 0; j < 9; ++j) {
        if (palabra[i].equals(colores[j])) {
          System.out.print(colores[j] + " ");
          ++contador;
        } 
      }
    }
    for (int i = 0; i < 8; ++i) {
      x = 0;
       while (!(palabra[i].equals(colores[x]))&&(x < 9)) {
        ++x;
      }
       
      if (x == 9) {
        System.out.print(palabra[i] + " ");
      }
      
    }
  }
}
    
    