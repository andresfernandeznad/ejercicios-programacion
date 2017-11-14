/**Ejercicio16 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int contador = 0;
    int figura = (int)(Math.random()*5);
    int aux = 0;
    
    for (int i = 0; i < 3; ++i) {
      aux = figura;
      figura = (int)(Math.random()*5);
      switch (figura) {
          case 0:
            System.out.print("corazón ");
            break;
          case 1:
            System.out.print("diamante ");
            break;
          case 2:
            System.out.print("herradura ");
            break;
          case 3:
            System.out.print("campana ");
            break;
          case 4:
            System.out.print("limón ");
            break;
      }
      if (aux == figura) {
        contador++;
      }
    }
    
    System.out.println();
    if (contador <= 0) {
      System.out.print("Lo siento has perdido.");
    } else if (contador == 1) {
      System.out.print("Ha recuperado su moneda.");
    } else {
      System.out.print("Enhorabuena ha ganado 10 monedas.");
    }
  }
}
      
