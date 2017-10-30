/**Ejercicio38 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    int espacios = 0;
  
    while ((altura < 3)||((altura%2)==0)) {
      System.out.println("Introduzca la altura: ");
      altura = s.nextInt();
    }
    int pintado = altura;
    
    //Pintar parte de arriba
    
    int alturaSuperior = (altura / 2) + 1;
    for (int i = 0; i < alturaSuperior; ++i) {
      for (int x = 0; x < espacios; ++x) {
        System.out.print(" ");
      }
      for (int j = 0; j < pintado; ++j) {
        System.out.print("*");
      }
      System.out.println();
      pintado -= 2;
      ++espacios;
    }
    
    //Pintar parte de abajo
    
    int alturaInferior = (altura / 2);
    pintado += 4;
    espacios = (altura / 2) - 1;
    for (int i = 0; i < alturaInferior; ++i) {
      for (int x = 0; x < espacios; ++x) {
        System.out.print(" ");
      }
      for (int j = 0; j < pintado; ++j) {
        System.out.print("*");
      }
      System.out.println();
      pintado += 2;
      --espacios;
    }
  }
}
      
