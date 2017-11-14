/**Ejercicio15 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio15 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    
    int melodia = (int)(Math.random() * 7) + 1;
    melodia *= 4;
    System.out.print("|");
    for (int i = 1; i <= melodia; ++i) {
      int nota = (int)(Math.random()*7);
      switch (nota) {
          case 0:
            System.out.print(" do ");
            break;
          case 1:
            System.out.print(" re ");
            break;
          case 2:
            System.out.print(" mi ");
            break;
          case 3:
            System.out.print(" fa ");
            break;
          case 4:
            System.out.print(" sol ");
            break;
          case 5:
            System.out.print(" la ");
            break;
          case 6:
            System.out.print(" si ");
            break;
      }
      if ((i % 4)==0) {
        System.out.print("|");
      }
    }
  }
}
