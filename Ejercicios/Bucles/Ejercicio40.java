/**Ejercicio40 de Bucles
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio40 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura: ");
    int altura = s.nextInt();
    
    //Controlador de datos
    while ((altura < 3)||((altura %2 )==0)) {
      System.out.print("Datos erróneos, introduzca de nuevo la altura: ");
      altura = s.nextInt();
      int x = 0;
    }
    
    //Pintar parte superior
    int espacioInterior = -1;
    int espacioExterior = altura / 2;
    int alturaSuperior = (altura / 2) + 1;
    for (int i = 0; i < alturaSuperior; ++i) {
      for (int j = 0; j < espacioExterior; ++j) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      //Mostrar espacios interiores
      if (i > 0) {
        for (int x = 0; x < espacioInterior; ++x) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
      --espacioExterior;
      espacioInterior += 2;
    }
   
    //Pintar parte inferior
    int alturaInferior = altura / 2;
    espacioExterior = 1;
    espacioInterior -= 4;
    
    for (int i = 0; i < alturaInferior; ++i) {
      for (int j = 0; j < espacioExterior; ++j) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int x = 0; x < espacioInterior; ++x) {
        System.out.print(" ");
      }
      if (i != alturaInferior - 1) {
        System.out.print("*");
      }
      System.out.println();
      espacioExterior++;
      espacioInterior -= 2;
    }
  }
}
