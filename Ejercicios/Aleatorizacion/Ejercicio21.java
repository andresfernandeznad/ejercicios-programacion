/**Ejercicio21 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio21 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int moneda = 0;
    int lado = 0;
    for (int i = 0; i < 5; i++) {
      moneda = (int)(Math.random()*8);
      switch (moneda) {
        case 0:
          System.out.print("1 céntimo - ");
          break;
        case 1:
          System.out.print("2 céntimos - ");
          break;
        case 2:
          System.out.print("5 céntimos - ");
          break;
        case 3:
          System.out.print("10 céntimos - ");
          break;
        case 4:
          System.out.print("20 céntimos - ");
          break;
        case 5:
          System.out.print("50 céntimos - ");
          break;
        case 6:
          System.out.print("1 euro - ");
          break;
        case 7:
          System.out.print("2 euros - ");
          break;
      }
      lado = (int)(Math.random() * 2);
      switch (lado) {
        case 0:
          System.out.print("cara.");
          break;
        case 1:
          System.out.print("cruz.");
          break;
      }
      System.out.println("");
    }
  }
}
