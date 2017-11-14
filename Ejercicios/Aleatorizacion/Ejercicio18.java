/**Ejercicio18 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int color = (int)(Math.random()*6);
    int i = 0;
    int aux = color;
    while (i < 3) {
      color = (int)(Math.random()*6);
      
      if (aux !=  color) {
        switch (aux) {
          case 0:
            System.out.print("rojo ");
            break;
          case 1:
            System.out.print("azul ");
            break;
          case 2:
            System.out.print("verde ");
            break;
          case 3:
            System.out.print("amarillo ");
            break;
          case 4:
            System.out.print("naranja ");
            break;
          case 5:
            System.out.print("violeta ");
            break;
            
        }
        ++i;
      }
      aux = color;
      
        
    }
  }
}
