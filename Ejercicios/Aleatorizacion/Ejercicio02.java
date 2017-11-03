/**Ejercicio02 de Aleatorización
*
*@author Andrés Fernández Nadales
* 
*/

import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int palo;
    int numero;
    numero = (int)((Math.random() * 13));
    switch (numero) {
      case 0:
        System.out.print("Su carta es A de ");
        break;
      case 1:
        System.out.print("Su carta es 2 de ");
        break;
      case 2:
        System.out.print("Su carta es 3 de ");
        break;
      case 3:
        System.out.print("Su carta es 4 de ");
        break;
      case 4:
        System.out.print("Su carta es 5 de ");
        break;
      case 5:
        System.out.print("Su carta es 6 de ");
        break;
      case 6:
        System.out.print("Su carta es 7 de ");
        break;
      case 7:
        System.out.print("Su carta es 8 de ");
        break;
      case 8:
        System.out.print("Su carta es 9 de ");
        break;
      case 9:
        System.out.print("Su carta es 10 de ");
        break;
      case 10:
        System.out.print("Su carta es J de ");
        break;
      case 11:
        System.out.print("Su carta es Q de ");
        break;
      case 12:
        System.out.print("Su carta es K de ");
        break;
    }
    palo = (int)(Math.random() * 4);
    switch (palo) {
      case 0:
        System.out.print("picas.");
        break;
      case 1:
        System.out.print("corazones.");
        break;
      case 2:
        System.out.print("tréboles.");
        break;
      case 3:
        System.out.print("diamante.");
        break;
    }
  }
}
