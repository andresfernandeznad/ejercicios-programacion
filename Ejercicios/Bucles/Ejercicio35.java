/**Ejercicio35 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    while ((altura < 3)||((altura%2)==0)) {
      System.out.println("Introduzca la altura: ");
      altura = s.nextInt();
      int x = 0;
    }

    int espaciosDelante = 0; //Espacios por la izquierda
    int espaciosInterior = altura - 2;
    int alturaInferior = altura / 2;
    
    //Parte superior en forma de v
    int alturaSuperior = (altura / 2) + 1;
    
    
    for (int i = 0; i < alturaSuperior; ++i) {
      for (int j = 0; j < espaciosDelante; ++j) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      
      
      if (i < alturaSuperior - 1) {
        //Espacios interiores
        for (int x = 0; x < espaciosInterior; ++x) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      
      espaciosDelante++;
      espaciosInterior -= 2;
    }
    System.out.println();
    
    espaciosDelante -= 2;
    espaciosInterior = 1;
    
    for (int i = 0; i < alturaInferior; ++i) {
      for (int j = 0; j < espaciosDelante; ++j) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      
      
      
      for (int x = 0; x < espaciosInterior; ++x) {
        System.out.print(" ");
      }
      System.out.println("*");
      
      
      espaciosDelante--;
      espaciosInterior += 2;
    }
    
  }
}
