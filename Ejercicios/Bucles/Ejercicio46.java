/**Ejercicio46 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio46 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura del rectángulo: ");
    int altura = s.nextInt();
    System.out.print("Introduce la anchura del rectángulo: ");
    int anchura = s.nextInt();
    while ((anchura < 2)||(altura < 2)) {
      System.out.println("Datos erróneos.");
      System.out.print("Introduce la altura del rectángulo: ");
      altura = s.nextInt();
      System.out.print("Introduce la anchura del rectángulo: ");
      anchura = s.nextInt();
    }
    
    //Pintar primera línea
    
    for (int i = 0; i < anchura; ++i) {
      System.out.print("*");
    }
    System.out.println();
    
    //Pintar parte central del rectángulo
    
    int alturaCentral = altura - 2;
    int espacios = anchura - 2;
    for (int i = 0; i < alturaCentral; ++i) {
      System.out.print("*");
      for (int j = 0; j < espacios; ++j) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    
    //Pintar última línea
    
    for (int i = 0; i < anchura; ++i) {
      System.out.print("*");
    }
  }
}
