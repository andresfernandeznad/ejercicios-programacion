/**Ejercicio13 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int primerDado = (int)(Math.random()*6) + 1;
    int segundoDado = (int)(Math.random()*6) + 1;
    System.out.println("Primer dado: " + primerDado);
    System.out.println("Segundo dado: " + segundoDado);
    if (primerDado != segundoDado) {
      while (primerDado != segundoDado) {
        primerDado = (int)(Math.random()*6) + 1;
        segundoDado = (int)(Math.random()*6) + 1;
        System.out.println("Primer dado: " + primerDado);
        System.out.println("Segundo dado: " + segundoDado);
        System.out.println("/////////////////////////////////");
      }
    }
  }
}
