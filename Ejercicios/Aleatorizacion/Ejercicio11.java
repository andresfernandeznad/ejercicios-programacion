/**Ejercicio11 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int suspensos = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    int nota;
    for (int i = 0; i < 20; ++i) {
      nota = (int)(Math.random() * 5);
      switch (nota) {
        case 0:
          suspensos++;
          System.out.print("Suspenso - ");
          break;
        case 1:
          suficiente++;
          System.out.print("Suficiente - ");
          break;
        case 2:
          bien++;
          System.out.print("Bien - ");
          break;
        case 3:
          notable++;
          System.out.print("Notable - ");
          break;
        case 4:
          sobresaliente++;
          System.out.print("Sobresaliente - ");
          break;
      }
    }
    System.out.println();
    System.out.println("Ha tenido: " + suspensos + " suspensos.");
    System.out.println("Ha tenido: " + suficiente + " suficientes.");
    System.out.println("Ha tenido: " + bien + " bienes.");
    System.out.println("Ha tenido: " + notable + " notables.");
    System.out.println("Ha tenido: " + sobresaliente + " sobresalientes.");
  }
}
